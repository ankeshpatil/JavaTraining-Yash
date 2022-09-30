package com.yash.java8feature.stream2;
	/**
	 * @author ankesh.patil
	 */

	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;
	import java.util.stream.Collectors;

	public class StateCityMain {

		public static void main(String[] args) {

			List<CityStream> cs = Arrays.asList(
					new CityStream(1, "pune", new StateStream(101, "maharashtra"), 9.5f, 500000, 493),
					new CityStream(2, "nagpur", new StateStream(101, "maharashtra"), 7.7f, 400000, 393),
					new CityStream(3, "hydrabad", new StateStream(102, "telangana"), 5.8f, 350000, 450),
					new CityStream(4, "karimnagar", new StateStream(102, "telangana"), 8f, 650000, 350),
					new CityStream(5, "patna", new StateStream(103, "bihar"), 6f, 450000, 500),
					new CityStream(6, "Ahmedabad", new StateStream(103, "Gujrat"), 8.6f, 600000, 300));

			System.out.println("find city with less area and highest population");
			List<CityStream> value = cs.stream().sorted(
					Comparator.comparing(CityStream::getPopulation).thenComparing(CityStream::getArea_of_city).reversed())
					.limit(1).collect(Collectors.toList());
			System.out.println(value);

			System.out.println("find city with high population index and high city area");
			List<CityStream> value1 = cs.stream().sorted(Comparator.comparing(CityStream::getPollutionIndex)
					.thenComparing(CityStream::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
			System.out.println(value1);

			System.out.println("print city with less population index first");
			List<CityStream> value2 = cs.stream().sorted(Comparator.comparing(CityStream::getPollutionIndex))
					.collect(Collectors.toList());
			System.out.println(value2);

			System.out.println("print city with lowest population index and lowest area");
			List<CityStream> value3 = cs.stream()
					.sorted(Comparator.comparing(CityStream::getPollutionIndex).thenComparing(CityStream::getArea_of_city))
					.limit(1).collect(Collectors.toList());
			System.out.println(value3);

			System.out.println("count how many city in state");
			long count = cs.stream().map(CityStream::getCityname).count();
			System.out.println(count);

			System.out.println("total area of each state");
			long sum = cs.stream().collect(Collectors.summingLong(CityStream::getArea_of_city));
			System.out.println(sum);

		}

	}

