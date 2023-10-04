package com.me.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.me.ws.FindingArmstrongService")
public class Armstrong{

	public boolean angs(int num) {
		int originalNumber = num;
		int remainder, result = 0;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num)
            return true;
        else
            return false;
    
	}
}