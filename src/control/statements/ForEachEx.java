package control.statements;

public class ForEachEx {
	public static void main(String[] args) {
		
		int[] mylist = new int[6];
		mylist[0]=1;
		mylist[1]=10;
		mylist[2]=13443;
		mylist[3]=1457;
		mylist[4]=1897;
		mylist[5]=134;
		System.out.println(mylist.length);
		for (int i : mylist) {
			System.out.println(i);
		}
		
	}
}
