package org.studyeasy;

public class Person {
	private String name;
	private int age;
	private String gender;

/*	public Person() {
		this.name = "Johnny Sins";
		this.age = 25;
		this.gender = "Male";
	}*/
	
	//میگه اگه اینم بهش ندیم میتونیم در متد اصلی بهش مقدار بدیم

	public Person(String name, int age, String gender) {

		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public boolean setAge(int age) {
		if (age >= 0 && age <= 100) {

			this.age = age;
			return true;
		}
		return false;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
