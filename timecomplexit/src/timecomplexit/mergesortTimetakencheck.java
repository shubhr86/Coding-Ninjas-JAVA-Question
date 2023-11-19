package timecomplexit;

public class mergesortTimetakencheck {
	public static void mergesort(int [] input) {
	
	// base case
			if (input.length<=1) {
				return;
			}
			
			int mid= input.length/2;
			
			// part1 and part2 temp Arrays
			
			int [] part1= new int [mid];	
			int [] part2= new int[input.length-mid];
			
			// copy elements into temp Arrays
			for (int i=0;i<mid;i++) {
				part1[i]= input[i];
			}
			int k =0;
			for (int i=mid;i<input.length;i++) {
				part2[k]= input[i];
				k++;
			}
			// call merge recursively
			mergesort(part1);
			mergesort(part2);
			merge(input, part1,part2);
		}
		private static void merge (int [] input, int part1[], int part2[]) {
			
			// merging subArrays of Array
			
			int i=0,j=0,k=0;
			// run while loop until array length is to be 1
			while (i<part1.length && j<part2.length) {
				if (part1[i]< part2[j]) {
					input[k]= part1[i];
					
					k++;
					i++;
				}
				else {
					input [k]= part2[j];
					k++;
					j++;
				}
			}
			// copy remaning elemnets of part1 if any,
			while(i< part1.length) {
				input [k]= part1[i];
				k++;
				i++;
			}
			// copy remaning elemnets of part2 if any,

			while (j<part2.length) {
				input[k]= part2[j];
				k++;
				j++;
			}
		}

	
		public static void main(String[] args) {
			for (int n=10; n<=10000000;n=n*10+9999) {
				int [] input = new int [n];
				for  (int i=0; i<input.length;i++) {
					input[i]= input.length-i;
				}
				
				long starttime =System.currentTimeMillis();
				mergesort(input);
				long endtime=System.currentTimeMillis();
				System.out.println("time taken by "+n +" " + " " +(endtime-starttime));
				
			}
			
			
			
		}
	}