

import java.rmi.*;
import java.rmi.server.*;
import java.util.Date;

public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorld{

	 HelloWorldImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String greetingHello(String strName) throws RemoteException {
		Date now = new Date();
		return "Hello " + strName +": Time of Reply - " + now;
	}

}
