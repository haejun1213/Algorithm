package recursive;

public class SumRec {

	public static void main(String[] args) {

	}
	
	static int sumRec(int number) {
		if(number == 1) return 1;
		
		return number + sumRec(number-1);
		
	}

}
