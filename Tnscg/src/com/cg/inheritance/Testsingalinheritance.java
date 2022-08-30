package com.cg.inheritance;

class Animal {
	void eat()
	{
	System.out.println("eating");
	}
	void bark()
	{
	System.out.println("barking");
	}

}
class Dog extends Animal{
	void run()
	{
	System.out.println("runing");
	}
}

class Testsingalinheritance{
	public static void main(String arg[])
	{
		Dog d=new Dog();
		d.eat();
		d.bark();
		d.run();
	}
}


