package marker;

public class MarkerTest {
// 어떤 동물이 어떤 분류인지 알려주는 메서드
	// 1. 초식동물이라면 초식동물이라고 알려주고
	// 2. 육식동물이라면 육식동물이라고 알려주고
	// 3. 아니라면 잡식동물
	
	public void checkKinds(Animal animal) {
		if(animal instanceof HerviboreMarker) {
			System.out.println(animal.getName() + "(은)는 초식 동물 입니다.");
		}else if(animal instanceof CarnivoreMarker) {
			System.out.println(animal.getName() + "(은)는 육식 동물 입니다.");
		}else {
			System.out.println(animal.getName() + "(은)는 잡식 동물 입니다.");
		}
	}
	
	public void checkAnimals(Animal[] animals) {
		for(Animal animal : animals) {
			checkKinds(animal);
		}
	}
	
	public static void main(String[] args) {
		Animal[] animals = {new Bear("곰순이" , 10), new Cat("고영희" , 20), new Cow("소이" , 15), new Dog("토토", 6), new Reabbit("토순이" , 5), new Tiger("호돌이" , 1)};
//		for(int i = 0; i < animals.length; i++) {
//			MarkerTest ma1 = new MarkerTest();
//			ma1.checkKinds(animals[i]);
//			ma1.checkAnimals(animals);
//		}
//		
		MarkerTest ma2 = new MarkerTest();
		ma2.checkAnimals(animals);
	}
}
