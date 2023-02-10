package atos;

public class Dog extends Animal  {
	
	public void bark() {
        System.out.println("Woo Woo");
    }
	
	public static void main(String[] args) {
		
		
		System.out.println("Dog");
        Dog d = new Dog();
        d.bark();
        d.eat();

	}

}
