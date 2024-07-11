package oopspkg;

interface Tvremote{
	public void sound();
	public void button();
}

interface Smarttvremote extends Tvremote{
	public void wifi();
}
class Tv implements Smarttvremote{
	public void Colortv(){
	System.out.println("Colortv")	;
	}

	@Override
	public void sound() {
		System.out.println("sound");
	}

	@Override
	public void button() {
		System.out.println("button");
	}

	@Override
	public void wifi() {
		System.out.println("wifi");
		
	}
}




public class Interfacepgm3 {

	public static void main(String[] args) {
		Tv ob=new Tv();
		ob.button();
		ob.Colortv();
		ob.sound();
		ob.wifi();

	}

}
