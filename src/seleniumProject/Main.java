package seleniumProject;

import java.util.ArrayList;
import java.util.List;

class Person {
		private String name;
		private int age;
		public Person(String name, int age) {
		this.name = name;
		this.age = age;
		}
		public String getName() {
		return name;
		}
		public int getAge() {
		return age;
		}
		@Override
		public String toString() {
		return "Name: " + name + ", Age: " + age;
		}
		}
		public class Main {
		public static void main(String[] args) {
		// Create a list to store Person objects
		List<Person> personList = new ArrayList<>();
		// Add some Person objects to the list
		personList.add(new Person("Alice", 30));
		personList.add(new Person("Bob", 25));
		personList.add(new Person("Charlie", 40));
		// Print the list of Person objects
		System.out.println("List of Persons:");
		for (Person p : personList) {
		System.out.println(p);
		}
		}
		}


