package com.java;

public class Laptop1 {
	String ModelName;
	double cost;
	String processor;
	int RAM;
		public Laptop1()
	{
		ModelName = "hp";
		cost = 60000.00;
		processor = "intel core i5";
		RAM =  4;
	}

	public void getLaptop1Details(){
		System.out.println("ModelName = "+ModelName);
		System.out.println("cost = "+"Rs."+cost);
		System.out.println("processor = "+processor);
		System.out.println("RAM = "+RAM + "GB");
	}
	public static void main(String[] args) {
		Laptop1 Laptop = new Laptop1();
		Laptop.getLaptop1Details();
		
	}

}