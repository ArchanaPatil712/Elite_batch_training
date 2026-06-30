package com.mmcoe.collections;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
	

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public int getAge() { return age; }
   

    @Override 
    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + "]";
    }

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.age-p.age;
	}
}