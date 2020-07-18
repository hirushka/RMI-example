package com.hirunirmani;

import java.rmi.*;
import java.rmi.registry.*;

public class HelloWorldServer {
	public static void main(String args[]){
		try{

			HelloWorld helloWolrdStub = new HelloWorldImpl();
			Naming.rebind("rmi://localhost:5000/hwrmi",helloWolrdStub);

		}catch(Exception e){System.out.println(e);}
		}

}
