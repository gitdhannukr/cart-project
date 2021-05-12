package com.pms.ust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ust.pms.model.MyNumbers;
import com.ust.pms.service.MyNumbersService;

@Controller
public class IndexController {

	@Autowired
	MyNumbersService myNumbersService;
	
	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView view = new ModelAndView();
		view.addObject("username", "Jay");
		view.addObject("password", "jay@123");
		view.setViewName("kapoor");
		return view;
	}
	
	@RequestMapping("/tufail")
	public String kapoor(){
		return "k";
	}

	
	@RequestMapping("/addNumbers")
	public ModelAndView addNumbers(){
		return new ModelAndView("addNumbersForm","name","tufail");
	}
	
	
	@RequestMapping("/result")
	public ModelAndView result(MyNumbers myNumbers)
	{
		int sum = myNumbers.getFirstNumber()+ myNumbers.getSecondNumber()+ myNumbers.getThirdNumber() + myNumbers.getFourNumber() + myNumbers.getFiveNumber();
		myNumbers.setResult(sum);
		myNumbersService.saveNumbers(myNumbers);
		
		ModelAndView view = new ModelAndView();
		view.addObject("res",sum);
		view.setViewName("myresult");
		//return new ModelAndView("result","sum",sum);
		return view;
	}
}
