package com.ust.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

/*import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;*/

/*@Entity
@Setter
@Getter
@NoArgsConstructor		//default
@RequiredArgsConstructor		//default
@AllArgsConstructor
@EqualsAndHashCode
@ToString*/
@Entity
public class Product {
		
		@Id
		private  @NonNull int productId;
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getQuantityOnHand() {
			return quantityOnHand;
		}
		public void setQuantityOnHand(int quantityOnHand) {
			this.quantityOnHand = quantityOnHand;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		private String productName;
		private @NonNull int quantityOnHand;
		private @NonNull int price;
	
		
		
}