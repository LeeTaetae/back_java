package acess;


// 이름, 주소, 나이
public class Member {
   private String name;
   private String address;
   private int age;

   public Member() {
      
   }

   public Member(String name, String address, int age) {
      this.name = name;
      this.address = address;
      this.age = age;
   }

   String getName() {
      return name;
   }

   void setName(String name) {
      this.name = name;
   }

   String getAddress() {
      return address;
   }

   void setAddress(String address) {
      this.address = address;
   }

   int getAge() {
      return age;
   }

   void setAge(int age) {
      this.age = age;
   }
   
   
//   Alt + Shift + S -> R -> Alt +  A -> R

}
