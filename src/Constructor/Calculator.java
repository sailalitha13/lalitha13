package Constructor;

public class Calculator 
{
	int a;
	int b;

	public Calculator(int x, int y)

	{
		a = x;
		b = y;
	}

	public void add() 
	{
		System.out.println(a + b);

	}

	public void mul() 
	{
		System.out.println(a * b);

	}

	public static void main(String[] args) 
	{
		new Calculator(20, 20).add();
		new Calculator(5, 5).mul();
        System.out.println("value");

	}

}
