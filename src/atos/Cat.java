package atos;

public class Cat extends Animal {
	
	public void meow() {
        System.out.println("meow meow");
    }

	public static void main(String[] args) {
		
		 System.out.println("*************");

	        System.out.println("Cat");
	        Cat c = new Cat();
	        c.meow();
	        c.eat();
	}

}
