package com.example.kickbox.client;

import com.google.gwt.user.client.rpc.AsyncCallback;


public interface TestAddServiceAsync {

	void testServer(String testString, AsyncCallback<String> callback);
}
