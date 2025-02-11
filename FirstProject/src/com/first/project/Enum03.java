package com.first.project;

enum Model {
	Hp(5000), Dell(60000), Lenovo, Samsong(980000); // Constructor

	private int price;

	private Model() { // Default & Private Constructor
		price = 56000;
	}

	private Model(int price) { // Parameterize Constructor
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class Enum03 {

	public static void main(String[] args) {
		
//		Model lap = Model.Dell;
//		System.out.println(lap + " " + lap.getPrice());
		
		for(Model lap : Model.values())
		{
			System.out.println(lap + " " + lap.getPrice());
		}

	}

}
