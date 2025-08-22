package classTest;

import java.util.Scanner;

public class SuperCar {
	
//	스택틱 블록 
	static {
		System.out.println("출고 축하합니다!");
	}
	
	// 초기화 블록
	{
		this.password = "0000";
	}
// 브랜드
	String brand;
//	색상
	String color;
//	가격
	long price;
//	엔진
	boolean engine;
//	비밀번호
	String password;
//	비밀번호 오류 횟수
	 int errorCount;
	 
	 public SuperCar() {;}
	 
	 // 초기화 생성자 오버로딩
	 public SuperCar(String brand, String color, long price) {
		 this.brand = brand;
		 this.color = color;
		 this.price = price;
	 }
	 
	 public SuperCar(String brand, String color, long price,String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	 }

	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}

	public void enginStart() {
		this.engine = true;
	}
	
	public void enginStop() {
		this.engine = false;
	}


	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("페라리" ,"red", 700_000_000, "5175");
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		String password = null;
		
		while(true) {
			System.out.println("1. 시동 켜기 \n 2. 사동 끄기");
			choice = sc.nextInt();
			
			if(choice == 1) {
				if(!ferrari.engine) {
					System.out.println("비밀번호 : ");
					password = sc.next();
					
					if(ferrari.checkPassword(password)) {
						ferrari.errorCount = 0;
						ferrari.enginStart();
						System.out.println(ferrari.brand + "시동이 켜졌습니다.");
					}else {
						ferrari.errorCount++;
						if(ferrari.errorCount > 2) {
							System.out.println("경찰이 출동했어요");
							break;
						}
					}
					
				}else {
					System.out.println(ferrari.brand  + "시동이 꺼져 있습니다.");
				}
				System.out.println();
			}else if(choice == 2) {
				if(ferrari.engine) {
					ferrari.enginStop();
					System.out.println("시동을 껐습니다.");
				}else {
					System.out.println("시동이 이미 꺼져있습니다.");
					continue;
				}
				
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
