package com.me.ws;

import javax.xml.ws.Endpoint;

public class ArmstrongPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:6800/myself", new Armstrong());
		System.out.println("Waiting for clients...");
	}
}