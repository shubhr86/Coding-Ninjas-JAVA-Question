package fraction;

public class fraction {
	
	private int num;
	private int den;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getDen() {
		return den;
	}
	
	public void setDen(int den) {
		this.den = den;
	}
	
	public  fraction(int num, int den) {
		this.den=den;
		this.num=num;
	}
	
	public void printfraction() {
		if (den==0) {
			return;
		} else {
			System.out.println(num+ "/" +den);
		}
	}

}
