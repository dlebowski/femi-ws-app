package impl;

import ws.HelloWorld;

public class HelloWorldImpl implements HelloWorld{

	private String message = new String("Hello, ");
	
	public String getHelloWorldAsString(String name) {
		return message + name + ".";
	}

}
