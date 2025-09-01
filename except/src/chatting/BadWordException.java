package chatting;

//Exception : 컴파일러가 검사한다. try - catch 를 강제한다.
// 강제 종료가 된다.

//ReunTimeException : 컴파일러가 검사하지 않는다. 즉 강제종료가 되지 않는다.
public class BadWordException extends RuntimeException{
	public BadWordException(String message) {
		//부모한테 메세지를 넘김
		//예외 만들어짐
		super(message);
	}
}
