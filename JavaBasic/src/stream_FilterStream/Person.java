package stream_FilterStream;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable{
	private String name;
	private int age;

	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}

	@Override
	public String toString() {
		return "Person (name="+ name +", age="+age+")";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

