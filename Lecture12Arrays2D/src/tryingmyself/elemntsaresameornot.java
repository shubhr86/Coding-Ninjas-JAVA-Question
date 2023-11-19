package tryingmyself;

public class elemntsaresameornot {

	public static void main(String[] args) {
		int arr[]= {1,2,1,1};
		boolean isSame=true;
		int j=arr.length-1;
		for (int i=0;i<arr.length/2;i++) {
			if (arr[i]!=arr[j]) {
				isSame=false;
				break;
			}
			else 
				j--;
				System.out.println(isSame);
			}
			
			
		}

	}

