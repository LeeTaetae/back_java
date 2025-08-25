package castingTest;

class Car {
   public Car() {;}
   void engineStart() {
      System.out.println("열쇠로 시동 켬");
   }
}

class SuperCar extends Car {
   public SuperCar() {;}
   @Override
   void engineStart() {
      System.out.println("음성으로 시동 켬");
   }
   
   void openRoof() {
      System.out.println("뚜껑 오픈!");
   }
}

public class CastingTest2 {
   public static void main(String[] args) {
      Car matix = new Car(); //객체화
//      Super ferrari = new Car(); //부족한 상태(오류)
      Car ferrari = new SuperCar(); // 업캐스팅
      Car matiz = (Car) new SuperCar(); //업캐스팅
      
//      객체 instance 타입
      System.out.println(matix instanceof Car);
      
      
   }
}










