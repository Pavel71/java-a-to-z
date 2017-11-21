package ru.pmishagin.gosha;

public class Person {

	public static int summ = 1234;

	int height;
	float weight;

	public void say(String str) {

		System.out.println(str);
	}

	public Person(int height, float weight) {

    this.height = height;
    this.weight = weight;
	}

	public Person() {

	}
}