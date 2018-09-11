/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {
public static void main(String[] args) {
	Smurf HandySmurf=new Smurf("Handy");
	HandySmurf.eat();
	String h=HandySmurf.getName();
	System.out.println(h);
	Smurf PapaSmurf=new Smurf("Papa");
	String p=PapaSmurf.getName();
	System.out.println(p);
	PapaSmurf.getHatColor();
	PapaSmurf.isGirlOrBoy();
	Smurf Smurfette=new Smurf("Smurfette");
	String s=Smurfette.getName();
	System.out.println(s);
	Smurfette.getHatColor();
	Smurfette.isGirlOrBoy();
}
	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if(name=="Papa") {
		System.out.println("my hat is red.");
		}else {
			System.out.println("my hat is white.");
		}
		return "";
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if(name=="Smurfette") {
			System.out.println("I am a girl.");
		}else {
			System.out.println("I am a boy.");
		}
		return "";
	}

}



