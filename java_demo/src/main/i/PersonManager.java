package main.i;

public class PersonManager {
	
	public static Person person;
	
	public static Person get(){
		
		if(person == null){
			synchronized (Person.class) {
				if(person == null){
					person = new Person();	
				}
			}
		}
		return person;
	}
	
	public static class Person{
		
		private String name;
		private int age;
		
		public Person setName(String name) {
			this.name = name;
			return person;
		}
		
		public Person setAge(int age){
			this.age = age;
			return person;
		}
		
		public void show(){
			
			System.out.println("person: " + person.name + ";" + person.age);
		}
	}
}
