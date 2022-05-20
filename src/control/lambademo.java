package control;

interface A 
{
	void show();
}

public class lambademo {

	public static void main(String[] args) {
		A obj;
		obj = () ->
		{
			System.out.println("hello");
		};
		obj.show();
	}

}
