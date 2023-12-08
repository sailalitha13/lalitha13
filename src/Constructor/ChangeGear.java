package Constructor;

public class ChangeGear 
{

	public void firstgear() 
	{
		System.out.println("firstgear");
	}

	public void secondgear()
	{
		System.out.println("secondgear");
	}

	public void thirdgear() 
	{
		System.out.println("thirdgear");
	}

	public static void main(String[] args) {

		new ChangeGear().firstgear();
		new ChangeGear().secondgear();
		new ChangeGear().thirdgear();

	}

}
