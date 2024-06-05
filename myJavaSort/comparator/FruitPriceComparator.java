package comparator;

import java.util.Comparator;

public class FruitPriceComparator implements Comparator<Fruit> {
	// FruitPriceComparator 클래스 정의, Comparator<Fruit> 인터페이스 구현

	public int compare(Fruit fruit1, Fruit fruit2) {
		return Integer.compare(fruit1.price, fruit2.price); // 과일의 가격으로 비교 후 값 반환
	}
	
}
