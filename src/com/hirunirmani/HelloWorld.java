package com.hirunirmani;

import java.rmi.*;

public interface HelloWorld extends Remote {
	public String greetingHello(String strName)throws RemoteException;

}
