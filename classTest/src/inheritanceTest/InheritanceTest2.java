package inheritanceTest;

class AA {
   void paint() {
      System.out.print("A");
      draw();
   }
   
   void draw() {
      System.out.print("B");
   }
}


class BB extends AA {
   @Override
   void paint() {
      super.draw(); // A의 draw check
      System.out.print("C");
      this.draw(); // B의 draw check
   }

   @Override
   void draw() {
      System.out.print("D");
   }
}

public class InheritanceTest2 {
   public static void main(String[] args) {
      BB b = new BB();
      b.paint(); //B, C, D
      b.draw(); // D
   }

}
