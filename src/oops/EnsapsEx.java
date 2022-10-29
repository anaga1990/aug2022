package oops;

public class EnsapsEx {
	
	//instance variables must be private
	private int age;
	private int classNumber;
	private boolean isSelected;
	private String name;
	
	public static void main(String[] args) {
		EnsapsEx e = new EnsapsEx(18, 10, true, "nag");
		System.out.println(e.getAge());
		System.out.println(e.getClassNumber());
		System.out.println(e.isSelected());
		System.out.println(e.getName());
		System.out.println("#################Starting Setters################");
		e.setAge(200);
		e.setClassNumber(2000);
		e.setName("bala");
		e.setSelected(true);
		System.out.println("################# after updated Setters################");
		System.out.println(e.getAge());
		System.out.println(e.getClassNumber());
		System.out.println(e.isSelected());
		System.out.println(e.getName());
		System.out.println("#################setting values by object Reff ################");
		e.age = 100;
		e.classNumber = 2;
		e.name = "hasbicbh";
		System.out.println(e.getAge());
		System.out.println(e.getClassNumber());
		System.out.println(e.isSelected());
		System.out.println(e.getName());
		
	}
	
	EnsapsEx(int a, int b, boolean c, String d){
		this.age = a;
		this.classNumber = b;
		this.isSelected = c;
		this.name = d;
	}
	
	// your class must have set or get methods / set & getMethods
	
	/*
	 *setter
	 * public void set${variable}(int age){
	 *  this.age = age;
	 * }
	 * 
	 * 
	 * getter
	 * public int getAge(){
	 * return this.age;
	 * }
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	
	
	
	
	
	
}
