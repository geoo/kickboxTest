package com.example.kickbox.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("greet")
public interface TestAddService extends RemoteService {
	String testServer(String testString);
}
