package comparable;

public class CFruit implements Comparable<CFruit> {
	private String name;
	private int price;

	public CFruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(CFruit anotherFruit) {
//		if (this.price > anotherFruit.price)
//			return 1;
//		if (this.price == anotherFruit.price)
//			return 0;
//		return -1;
		return Integer.compare(this.price, anotherFruit.price); 
		// 비교한 값중 앞에 값이 크면 1 반환
		// 같으면 0 반환
		// 비교한 값중 앞에 값이 작으면 -1 반환
	}

	@Override
	public String toString() {
		return name + ":" + price;
	}

}
