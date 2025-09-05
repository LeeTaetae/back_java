package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask1 {
   public static void main(String[] args) {
      
//      요구사항
//      모두 stream문법으로 사용한다.
      
//      1. 1~10까지 ArrayList에 담고 출력
	   ArrayList<Integer> datas1 = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 10).forEach(datas1::add);
	   System.out.println(datas1);
	   
//      2. ABCDEF를 각각 문자별로 출력
	   IntStream.rangeClosed(1, 6).map((n) -> n + 64).forEach((n) -> {System.out.println((char)n);});
	   
//      3. 1~100까지 중 홀수만 ArrayList에 담고 출력
	   ArrayList<Integer> datas2 = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 100).filter((n) -> n % 2 == 1).forEach(datas2::add);
	   System.out.println(datas2);
	   
	   
	   
//      4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
	   ArrayList<String> datas3 = new ArrayList<String>();
	   IntStream.range(1, 6).filter((n) -> n != 4).map((n) -> n + 64).forEach((n) -> {datas3.add(String.valueOf((char)n));});
	   System.out.println(String.valueOf(datas3));
	   
	   
//      5. 5개의 문자열을 모두 소문자로 변경 후 출력
//      "Black", "WHITE", "reD", "yeLLow", "PInk"
	   ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
	   colors.stream().map((n) -> n.toLowerCase()).forEach(System.out::println);
	   
//      6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
	   ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "orange"));
	   fruits.stream().filter((fruit) -> Character.isUpperCase(fruit.charAt(0))).forEach(System.out::println);
	   
	   
//      7. 한글을 정수로 변경 "공칠이삼" -> 0723
//	   ArrayList<String> hangels = new ArrayList<String>(Arrays.asList("공칠이삼"));
//	  hangels.stream().map((hangel) -> hangel.replace("공", "0").replace("칠", "7").replace("이", "2").replace("삼", "3")).forEach(System.out::println);;
	   String hangle = "공일이삼사오육칠팔구";
	   String input = "이공일사";
	   input.chars().map(hangle::indexOf).forEach(System.out::println);
	   
//      8. 정수를 한글로 변경 0723 -> "공칠이삼"
//	  ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(Integer.parseInt("0723")));
//	  numbers.stream().map((n) -> String.format("%04d", n)).map((n) -> n.replace("0", "공").replace("7" , "칠").replace("2", "이").replace("3", "삼")).forEach(System.out::println);
	  String input2 = "0723";
	  input2.chars().map((c)-> c-48).map(hangle::charAt).forEach((c) -> {System.out.println((char)c);});
	  
	  
	   
      
   }
}
