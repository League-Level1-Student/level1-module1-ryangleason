
public class SmurfRunner {
public static void main(String[] args) {
	Smurf a = new Smurf("handy");
	Smurf b = new Smurf("Papa Smurf");
	Smurf c = new Smurf("Smurfette");
	a.eat();
	a.getName();
	System.out.println("[enter papa smurf]");
	b.getName();
	System.out.println(b.getName());
	b.getHatColor();
	b.isGirlOrBoy();
	System.out.println("I am a " + b.isGirlOrBoy());
	System.out.println("My hat is "+b.getHatColor());
	c.getHatColor();
	c.getName();
	c.isGirlOrBoy();
	System.out.println("[enter Smurfette]");
	System.out.println(c.getName());
	System.out.println("I am a " + c.isGirlOrBoy());
	System.out.println("my hat is " + c.getHatColor());
}
}
