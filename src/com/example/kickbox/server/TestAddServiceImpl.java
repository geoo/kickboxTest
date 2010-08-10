package com.example.kickbox.server;

import com.example.kickbox.client.GreetingService;
import com.example.kickbox.client.TestAddService;
import com.example.kickbox.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class TestAddServiceImpl extends RemoteServiceServlet implements TestAddService{

	public String testServer(String string) {
		string = string.toUpperCase();
		System.out.println("serverimpl");
		return string;
	}
	
	
}
