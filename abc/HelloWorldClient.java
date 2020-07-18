

import java.rmi.*;
import java.util.Date;

public class HelloWorldClient {
	public static void main(String args[]){
		try{
				Date now1 = new Date();
				System.out.println("Requst sending time : " + now1);
				HelloWorld helloWorldStub=(HelloWorld)Naming.lookup("rmi://localhost:5000/hwrmi");
				System.out.println(helloWorldStub.greetingHello("Hirushka"));

		}catch(Exception e){System.out.println(e);}
		}

}
