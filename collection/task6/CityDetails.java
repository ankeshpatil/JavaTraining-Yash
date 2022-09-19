package com.yash.collection.task6;

public class CityDetails {

	private String name;
	private int population;

	public CityDetails(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "CityDetails [name=" + name + ", population=" + population + "]";
	}
	
	

}
