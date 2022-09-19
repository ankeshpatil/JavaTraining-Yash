/**
 * WAP to store elements in List and remove all duplicates names of items. After 
duplicates are removed print all elements in descending order. 
 */
package com.yash.collection.task4;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author ankesh.patil
 *
 */
public class TestMain4 {
	static Logger logger=Logger.getLogger(TestMain4.class.getName());
	public static void main(String[] args) {
		BasicConfigurator.configure();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ankesh");
		al.add("Satyajeet");
		al.add("Ketan");
		al.add("Ankesh");
		al.add("Yogesh");
		al.add("Ketan");
		
		ArrayList<String> nl=new ArrayList<String>();
		for(String s:al) {
			if(!nl.contains(s)) {
				nl.add(s);
			}
		}
		Collections.sort(nl);
		Collections.reverse(nl);
		logger.info("Duplicate are removed and order is decending >> "+"\n"+nl);
	}
}