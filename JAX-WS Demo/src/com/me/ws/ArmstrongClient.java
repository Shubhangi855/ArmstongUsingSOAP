package com.me.ws;

import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ArmstrongClient {

	public static void main(String[] args) throws Exception{
		URL url = new URL("http://127.0.0.1:6800/myself?wsdl");
		
		QName qname = new QName("http://ws.me.com/","ArmstrongService");
		
		Service service = Service.create(url, qname);
		
		FindingArmstrongService endPoint = service.getPort(FindingArmstrongService.class);
		
		Scanner scInput = new Scanner(System.in);
		
		int num1 = 0 ;
		boolean answer;
		
		System.out.print("Enter number: ");
		num1 = Integer.parseInt(scInput.nextLine());
		
		
		answer = endPoint.angs(num1);
		if(answer == true)
		System.out.println(num1+" is an armstrong number");
		else
	    System.out.println(num1+" is not an armstrong number");
	
		scInput.close();
	}
}