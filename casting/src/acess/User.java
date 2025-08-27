package acess;

public class User {
	private String userName;
	
	public User() {;}
	
	public User(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void getFunction(Netflex netflex) {
		if(netflex instanceof Movie) {
			Movie movie = (Movie) netflex;
			movie.getFunction();
		} else if(netflex instanceof Animation) {
			Animation animation = (Animation) netflex;
			animation.getFunction();
		}else if(netflex instanceof Drama) {
			Drama drama = (Drama) netflex;
			drama.getFunction();
		}else {
			System.out.println("등록되지 않은 기능입니다.");
		}
		
	}
}
