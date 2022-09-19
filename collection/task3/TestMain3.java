package com.yash.collection.task3;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * 
 * @author ankesh.patil
 *
 */
/*
 * WAP to store elements in List and remove all duplicates value from it.
 * (Numbers should be inserted). When duplicates are removed print all elements
 * in ascending order
 */
public class TestMain3 {
	static Logger logger = Logger.getLogger(TestMain3.class.getClass());

	public static  ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {

		ArrayList<Integer> newList = new ArrayList<Integer>();

		for (Integer element : list) {

			if (!newList.contains(element)) {

				newList.add(element);
			}
		}

		return newList;
	}

	public static void main(String[] args) {
		BasicConfigurator.configure();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(13);
		al.add(44);
		al.add(36);
		al.add(44);
		al.add(51);
		al.add(39);

		ArrayList<Integer> nl = removeDuplicates(al);

		Collections.sort(nl);

		logger.info("ArrayList with duplicates removed: " + nl);

	}
}
