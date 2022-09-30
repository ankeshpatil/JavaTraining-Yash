package com.yash.springioc.ioc_asignment;
/**
 * 
 * @author ankesh.patil
 *
 */
public class SetterMessage {
private String message="";

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public String toString() {
	return "SetterMessage [message=" + message + "]";
}

}
