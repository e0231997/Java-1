package gitTutorial;

public class Third
{
	//class added by surface
	
	static int count;
	
	//static 
	{
		count++;
		System.out.println(" block running :"+count);
	}
	
	
	
	public Third()
	{
		System.out.println("Third Class Constructor called");
	}



	public void sayHi()
	{
		System.out.println("Hi Hi");
		System.out.printf("%1$s %n","hello");
		System.out.println(String.format("%1$s","hello"));
	}
	
	public void sayHello()
	{
		System.out.println("Hello from acer");
	}
	
	public void sayBye()
	{
		System.out.println("Bye Bye from surface");
	}
}

