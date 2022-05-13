package user;

public class userDTO {
	
	String userID;
	String userPassword;
	
	// getter(현재에 입력된 데이터 가져오기)와 setter(데이터 기록하기) 만들어주기
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
