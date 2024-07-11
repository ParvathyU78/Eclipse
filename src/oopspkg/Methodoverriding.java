package oopspkg;

class Shape
{
	public void draw()
	{
		System.out.println("draw any shape");
	}
}
class circle extends Shape
{

	@Override
	public void draw() {
		System.out.println("shape is circle");
		super.draw();
	}
	
}

public class Methodoverriding {

	public static void main(String[] args) {
		circle ob=new circle();
		ob.draw();

	}

}
