package myPackage1;


abstract class Animal {
	  //declare a final variable:
	int b = 20;
			
	  // Abstract method (does not have a body)
	  public abstract void animalSound();
	  // Regular method
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}

//Subclass (inherit from Animal)
class Pig extends Animal
{

//Implementing the abstract method in the child class	
public void animalSound()
{
 // The body of animalSound() is provided here
 System.out.println("The pig says: wee wee");
}
}

public class MainClass{

	public static void main(String[] args)
	{
		Pig obj1 = new Pig();
        obj1.sleep();
        obj1.animalSound();
        obj1.b = 15;
        System.out.println(obj1.b);
	}
}
