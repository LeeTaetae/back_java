package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamTest2 {
	public static void main(String[] args) {
//		int maxCount = 0;
		
		
		ArrayList<String> products = new ArrayList<String>();

		products.add("노트북-삼성-150");
		products.add("스마트폰-애플-200");
		products.add("태블릿-삼성-300");
		products.add("스마트워치-샤오미-120");
		products.add("스마트폰-삼성-250");
		
//		1. 브랜드가 '삼성'인 제품만 뽑아서 배열게 담아 출력
		ArrayList<String> samsungs =products.stream().filter((product) -> product.contains("삼성")).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(samsungs);
		
//		2. 모든 제품 이름만 뽑아서 배열에 담아 출력
		ArrayList<String> names = products.stream().map(p -> p.split("-")[0]).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(names);
		
//		3. 가격만 뽑아서 배열에 담고, 총합을 구해 출력
		ArrayList<Integer> prices = products.stream().map(product -> Integer.parseInt(product.split("-")[2])).collect(Collectors.toCollection(ArrayList::new));
//		for(Integer price : prices) {
//			count += price;
//		}
		int count = prices.stream().mapToInt(Integer::intValue).sum();
		System.out.println(count);
		
//		4. 모든 브랜드 이름만 뽑되, 중복은 제거하여 배열에 담아 출력
		ArrayList<String> disNames = products.stream().map((product) -> product.split("-")[1]).distinct().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(disNames);
		
//		5. 가격이 200이상인 제품만 뽑아서 배열에 담아 출력
		int[] prices2 = products.stream().map((product) -> product.split("-")[2]).mapToInt(Integer::parseInt).filter(n-> n >= 200).toArray();
		System.out.println(Arrays.toString(prices2));
		
//		6. 가장 비싼 제품(가격이 가장 큰 제품)을 찾아 출력
		int maxprice = products.stream().mapToInt((product) -> Integer.parseInt(product.split("-")[2])).max().orElseThrow();
		ArrayList<String> maxproduct = products.stream().filter((product) -> Integer.parseInt(product.split("-")[2]) == maxprice).collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println("가장 비싼 금액: " + maxprice);
		System.out.println("가장 비싼 제품 : " + maxproduct);
	} 
}

