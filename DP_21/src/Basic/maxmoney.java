package Basic;

public class maxmoney {

	public static int maxmoney(int arr[]) {

		return maxMoney(arr,0,0);

	}
	public static int maxMoney(int [] houses,int i,int money){
		if(i>=houses.length){
			return money;
		}
		int op1=maxMoney(houses,i+1,money);
		int op2=maxMoney(houses,i+2,money+houses[i]);
		return Math.max(op1,op2);

	}


	public static void main(String[] args) {
		int arr[]= {10, 2 ,30,20 ,3 ,50};
		System.out.println(maxmoney(arr));
	}

}
