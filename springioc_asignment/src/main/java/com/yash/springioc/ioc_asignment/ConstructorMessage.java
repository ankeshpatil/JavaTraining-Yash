package com.yash.springioc.ioc_asignment;

public class ConstructorMessage {
private String message="";

public ConstructorMessage() {
	super();
	// TODO Auto-generated constructor stub
}

public ConstructorMessage(String message) {
	super();
	this.message = message;
}

@Override
public String toString() {
	return "ConstructorMessage [message=" + message + "]";
}



}
