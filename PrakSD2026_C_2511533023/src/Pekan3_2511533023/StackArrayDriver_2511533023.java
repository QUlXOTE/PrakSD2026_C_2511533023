package Pekan3_2511533023;

public class StackArrayDriver_2511533023 {
	public static void main (String [] args){
		StackArray_2511533023 s = new StackArray_2511533023();
		s.push_3023(10);
		s.push_3023(20);
		s.push_3023(30);
		System.out.println(s.pop_3023() + " dikeluarkan dari Stack");
		System.out.println("elemen teratas adalah :" + s.peek_3023());
		System.out.println("elemen pada stack :");
		s.print_3023();
	}

}
