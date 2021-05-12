package com.ust.pms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import lombok.Data;


//@Data
@Entity
public class MyNumbers {
	@Id
	@GeneratedValue
	private int attempt;
	
	private int firstNumber;
	private int secondNumber;
	private int thirdNumber;
	private int fourNumber;
	private int fiveNumber;
	
	private int result;

	public int getAttempt() {
		return attempt;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getThirdNumber() {
		return thirdNumber;
	}

	public void setThirdNumber(int thirdNumber) {
		this.thirdNumber = thirdNumber;
	}

	public int getFourNumber() {
		return fourNumber;
	}

	public void setFourNumber(int fourNumber) {
		this.fourNumber = fourNumber;
	}

	public int getFiveNumber() {
		return fiveNumber;
	}

	public void setFiveNumber(int fiveNumber) {
		this.fiveNumber = fiveNumber;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	
}
