package com.learn.java8.streams.exmaple.fruits;

import java.util.ArrayList;
import java.util.List;

public class Fruits {

	private String name;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Fruits(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public static List<Fruits> getFruits(){
		List<Fruits> list = new ArrayList<>();
		list.add(new Fruits("Apple","Fruit"));
		list.add(new Fruits("Potato","Vegetable"));
		list.add(new Fruits("Onion","Vegetable"));
		list.add(new Fruits("Banana","Fruit"));
		list.add(new Fruits("Peach","Fruit"));
		list.add(new Fruits("Cucumber","Vegetable"));
		list.add(new Fruits("Cherry","Fruit"));
		list.add(new Fruits("Okra","Vegetable"));
		list.add(new Fruits("Beans","Vegetable"));
		list.add(new Fruits("Mango","Fruit"));


		return list;
		
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", type=" + type + "]";
	}
}
