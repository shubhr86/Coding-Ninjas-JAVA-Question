package Genrics;

public class printArray {
	
	public static <T> void print(T arr[] ){
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer a []= new Integer[10];
		for (int i=0;i<a.length;i++) {
			a[i]= i*2;
		}
		String s[]= new String[10];
		for (int i=0;i<s.length;i++) {
			s[i]="shubham";
		}
		print(a);
		print(s);

	}
	

}
