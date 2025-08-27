package restaurant;

public class Restaurant {
	private String name;
	private int menu;
	private int menuCount;
	
	public Restaurant() {;}

	public Restaurant(String name, int menu, int menuCount) {
		super();
		this.name = name;
		this.menu = menu;
		this.menuCount = menuCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public int getMenuCount() {
		return menuCount;
	}

	public void setMenuCount(int menuCount) {
		this.menuCount = menuCount;
	}
	
	// 메뉴 등록
	MenuItem[] menus = new MenuItem[5];
	int menuCo = 0;
	void getRegister(MenuItem menu) {
		//중복 메뉴가 있는지 확인한다.
		//중복 메뉴가 있다면?
		for(int i = 0; i < menuCo; i++) {
			if(menus[i].getName().equals(menu.getName())) {
				System.out.println("이미 있는 이름입니다. 다시 한 번 더 확인하십시오.");
			}
		}
		
		//최대 5개까지만 등록 가능
		//5개 이하일 경우
		if(menuCount <= 5) {
			System.out.println("메뉴가 등록되었습니다. \n 현재 메뉴 수 : " + menuCount);
		}else if(menuCount > 5) {
			System.out.println("메뉴는 최대 5개까지만 등록이 가능합니다.");
		}
		
		System.out.println("=========================");
		
		//재고가 50을 초과할 경우
		if(menu.getStock() >= 50) {
			System.out.println("재고는 최대 50개만 등록이 가능합니다. \n메뉴 : " + menu.getName());
		}else if(menu.getStock() < 50) {
			System.out.println("재고가 등록되었습니다. \n현재 재고 수 : " + (menu.getStock() + 1) + "\n메뉴 : " + menu.getName());
		}
	}
	
	boolean TrueOrFalse = false;
	void getOrder(MenuItem menu, RestaurantCostomer user) {
		//등록된 메뉴만 주문 가능
		//등록된 메뉴인지 아닌지 확인하기
		
	}
}
