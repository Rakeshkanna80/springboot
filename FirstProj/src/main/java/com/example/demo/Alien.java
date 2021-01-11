package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	private int id;
	private String name;
	@Autowired
	private Laptop laptop;

	public Alien() {
		System.out.println("object created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("show");
		laptop.display();
	}

}
