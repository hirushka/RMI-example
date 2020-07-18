package com.hirunirmani;

import java.rmi.*;

public class HelloWorldClient {
	public static void main(String args[]){
		try{
	
				HelloWorld helloWorldStub=(HelloWorld)Naming.lookup("rmi://localhost:5000/hwrmi");
				System.out.println(helloWorldStub.greetingHello("Hirushka"));

		}catch(Exception e){System.out.println(e);}
		}

}
