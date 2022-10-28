package oops;

public class TestChild2 {
	public static void main(String[] args) {
		Humans child= new Parents();
		//Runtime Polymorphism or Dynamic Polymorphism
		child.favoriteColor();//Compiler ==> void oops.Parents.favoriteColor()
	}
}
