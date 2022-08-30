package com.cg.inheritance;
class LeavingAnimal{
	void eat()
	{
		System.out.println("eating");
	}
	void run()
	{
		System.out.println("running");
	}
	void jump()
	{
		System.out.println("jumping");
	}
}

class Dod extends LeavingAnimal{
	
	void bark()
	{
		System.out.println("dog  barking");
	}
}
class Cat extends LeavingAnimal 
{
    void meowing()	
    {
    	System.out.println("cat meowing");
    }
}

public class TestHierarchicalinheritance {
	public static void main(String arg[])
	{
		Dog d=new Dog();
		Cat c=new Cat();
		d.bark();
		c.meowing();
		c.eat();
		d.eat();
		
	}

}
