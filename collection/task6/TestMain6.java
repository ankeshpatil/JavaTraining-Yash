
/**
 * WAP to store data in hashmap. Keys are the city name and values are the population. 
Now you have to sort the all elements (on the basis of city name ) in hashmap and 
print the detail.
 */
package com.yash.collection.task6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author ankesh.patil
 *
 */
public class TestMain6 {

	static Logger logger = Logger.getLogger(TestMain6.class.getClass());

	public static void main(String[] args) {
		BasicConfigurator.configure();

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		CityDetails cd1 = new CityDetails("Pune", 7263822);
		CityDetails cd2 = new CityDetails("Mumbai", 8293822);
		CityDetails cd3 = new CityDetails("Nasik", 5463822);
		CityDetails cd4 = new CityDetails("Nagpur", 2373822);
		CityDetails cd5 = new CityDetails("Malkapur", 1293822);

		hm.put(cd1.getName(), cd1.getPopulation());
		hm.put(cd2.getName(), cd2.getPopulation());
		hm.put(cd3.getName(), cd3.getPopulation());
		hm.put(cd4.getName(), cd4.getPopulation());
		hm.put(cd5.getName(), cd5.getPopulation());
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(hm);

		Iterator<Map.Entry<String, Integer>> itr = tm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			logger.info(entry.getKey()+" = "+entry.getValue());
			
		}
	}
}
