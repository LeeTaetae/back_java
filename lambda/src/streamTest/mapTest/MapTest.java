package streamTest.mapTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MapTest {
   public static void main(String[] args) {
      
      ArrayList<User> users = new ArrayList<User>(); 
      
      User user1 = new User(1L, "홍길동", 17, "개발자");
      User user2 = new User(1L, "장보고", 20, "기획자");
      User user3 = new User(1L, "이순신", 35, "디자이너");
      User user4 = new User(1L, "이성계", 42, "개발자");
      User user5 = new User(1L, "이태희", 22, "사장");
      
      users.add(user1);
      users.add(user2);
      users.add(user3);
      users.add(user4);
      users.add(user5);
      
//      System.out.println(users);
//      users.stream().map((user) -> user.getName()).forEach(System.out::println);
      
      ArrayList<Integer> datas1 = new ArrayList<Integer>();
//      1 ~ 10까지 datas1에 추가
//      datas1의 모든 값을 10배로 변경한다
//      datas1의 모든 값을 출력한다.
//      1. 1 ~ 10까지 datas1에 추가
//      2. stream() 사용
//      3. map으로 각 값에 10배를 곱하기
//      4. forEach로 각 값을 출력
      IntStream.rangeClosed(1, 10).forEach((n) -> datas1.add(n));
//      System.out.println(datas1);
      
//      datas1.stream().map((n) -> (n * 10) + " ").forEach(System.out::print);
//      System.out.println(datas1);
      
//      .map()
//      1. ArrayList의 값을 알파벳으로 바꾸기
//      2. ArrayList에 있는 값을 stream으로 순차적으로 접근한다.
//      3. map을 통해 각 번호에 64를 더한다.(아스키코드 활용)
//      4. forEach를 통해 String.value()에 char값으로 변경한다.
      datas1.stream().map((n) -> n + 64).forEach((n) -> {
    	  System.out.println((char) (int)n);
      });
      
      
      
   }
}
