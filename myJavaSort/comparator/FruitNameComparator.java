package comparator;

import java.util.Comparator;

	public class FruitNameComparator implements Comparator<Fruit> {
		// FruitNameComparator 클래스 정의, Comparator<Fruit> 인터페이스 구현
		
		@Override
		public int compare(Fruit fruit1, Fruit fruit2) {
			return fruit1.name.compareTo(fruit2.name); //과일의 이름으로 비교 후 값 반환
		}

	}

