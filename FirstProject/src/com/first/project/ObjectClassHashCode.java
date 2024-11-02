package com.first.project;

import java.util.Objects;

class Laptop{
	String model;
	int price;

	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}

	public int hashCode() {
		return Objects.hash(model, price);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
	
}

public class ObjectClassHashCode {

	public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.model = "Hp";
		obj.price = 65000;
		
		boolean result = obj.equals(obj);
		
		System.out.println(obj);
		System.out.println(result);
		

	}

}

