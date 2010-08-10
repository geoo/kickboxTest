package com.example.kickbox.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class TestAdd {

;

	public static void testServer(String testString, AsyncCallback<String> asyncCallback) {

		final TestAddServiceAsync testService = GWT.create(TestAddService.class);
		
		testService.testServer(testString, new AsyncCallback<String>() {
			public void onFailure(Throwable caught) {
				System.out.println("RPC gescheitert");
			}

			public void onSuccess(String result) {
				System.out.println("RPC erfolgreich "+ result);
			}
		});
	}

}
