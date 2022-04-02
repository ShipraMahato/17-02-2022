package com.java;

public class AndroidPhones {
	String ModelName;
	double cost;
	String processor;
	int RAM;
	int Storage;
	double Display;

	public AndroidPhones()
	{
		ModelName = "Xiaomi Redmi Note 11";
		cost = 1599.00;
		processor = "Qualcomm SM6225 Snapdragon 680 4G";
		RAM =  4;
		Storage = 64;
		Display = 6.43;
	}

	public void getAndroidPhonesDetails()
	{
		System.out.println("ModelName ="+ModelName);
		System.out.println("cost ="+"Rs. "+cost);
		System.out.println("processor ="+processor);
		System.out.println("RAM ="+RAM + "GB");
		System.out.println("Storage = "+Storage + "GB");
		System.out.println("Display = "+Display+ " inches");
	}


	public static void main(String[] args) {

		AndroidPhones androidphone = new AndroidPhones();
		androidphone.getAndroidPhonesDetails();
		
	}

}

