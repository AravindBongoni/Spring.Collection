package com.Aravind;

import java.util.Iterator;
import java.util.List;

public class Collection {
	private int id;
	private String name;
	private float salary;
	private List<String> ans;
	public Collection() {}
	public Collection(int id, String name, float salary, List<String> ans) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ans = ans;
	}
	public void display() {
		System.out.println(id+" "+name+" "+salary);
		System.out.println("Ans");
		Iterator<String>itr = ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
	
}
