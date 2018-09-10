package com.learn.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.learn.java8.streams.exmaple.fruits.Fruits;

public class StreamsMain {

	
	public static void main(String[] args) {
		intStreams();
		List<Fruits> fruits= Fruits.getFruits();
		fruits.stream().forEach(System.out::println);
		fruits.stream().map(f -> f.getType()).map(String::toUpperCase).forEach(System.out::println);
		//Map<String, Fruits> map = fruits.stream().collect(Collectors.toMap(f -> f., fruit -> fruit));
		long count = fruits.stream().map(f -> f.getType()).distinct().count();
		System.out.println("Distinct " + count);
		fruits.stream().map(f -> f.getType()).limit(4).forEach(System.out::println);
		
		System.out.println(fruits.stream().findFirst());
		System.out.println(fruits.stream().filter(f -> f.getType().equals("Vegetable")).findFirst().get());
		System.out.println(fruits.stream().filter(f -> f.getType().equals("Vegetable")).findAny().get());
		System.out.println(fruits.stream().anyMatch(f -> f.getType().equals("Fruit")));
		System.out.println(fruits.stream().anyMatch(f -> f.getType().equals("abc")));
		
		System.out.println(fruits.stream().allMatch(f -> f.getType() != null));
		System.out.println(fruits.stream().allMatch(f -> f.getType() == null));
		
		
		System.out.println(fruits.stream().noneMatch(f -> f.getType() != null));
		System.out.println(fruits.stream().noneMatch(f -> f.getType() == null));
		
		System.out.println(fruits.stream().map(f -> f.getType()).reduce((a,b) -> a.concat(b)));
		
		Map<String, List<Fruits>> maps = fruits.stream().collect(Collectors.groupingBy(a -> a.getType()));
		System.out.println(maps);
		
		Map<Boolean, List<Fruits>> mapsPartition = fruits.stream().collect(Collectors.partitioningBy(f -> f.getType().equals("Vegetable")));
		System.out.println(mapsPartition);
		
		fruits.stream().flatMap(s -> s.getFruits().stream());	




		//fruits.stream().
		//filter(f -> "Fruit".equals(f.getType()) ? true:false).
		//forEach(s -> System.out.println(s.getName()));

		//Stream emptyStream = Stream.empty();
		//System.out.println(emptyStream.distinct());
	}
	
	private static void intStreams() {
		int[] i = {2,4,6,7,8,9,10};
		
		IntStream stream= IntStream.of(i);
		//stream.forEach(System.out::println);
		long count = stream.filter(x -> x % 2 != 0 ? true:false).count();
		System.out.println(count);
	}

}
