package com.java;
	import java.util.Scanner;
	public class Laptop{
	    String brand;
	    int price;
	    String os;
	    public Laptop()
	    {
	      Scanner scanner=new Scanner(System.in);
	      System.out.println("Enter laptop brand= ");
	      brand=scanner.next();
	      System.out.println("Enter laptop price= ");
	      price=scanner.nextInt();
	      System.out.println("Enter laptop os= ");
	      os=scanner.next();
	      scanner.close();
	    }
	    public void getLaptopDetails()
	    {
	        System.out.println("--Value you entered is--");
	        System.out.println("Brand= "+brand);
	        System.out.println("Price= "+price);
	        System.out.println("Os= "+os);
	    }
	    public static void main(String args[]){
	        Laptop obj1=new Laptop();
	        obj1.getLaptopDetails();
	   }
	}