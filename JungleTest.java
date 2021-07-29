public class JungleTest
{
	public static void main(String[] args) 
	{
		Lion l = new Lion();
		l.roar();
		Cat c = new Cat();
		c.meow();
		Tiger t = new Tiger();
		t.jump();
		Fox f1 = new Fox();
		f1.screaming();
		Cow cc = new Cow();
		cc.lowing();

		
	}
}
class Lion{
	void roar(){
		System.out.println("Lion!");
	}
}


class Tiger{
	void jump(){
		System.out.println("Tiger!");
	}
}
class Fox{
	void screaming(){
		System.out.println("Fox!");
	}
}

class Cow{
	void lowing(){
		System.out.println("Cow!");
	}
}

class Cat{
	void meow(){
		System.out.println("Cat ....!");
	}
}