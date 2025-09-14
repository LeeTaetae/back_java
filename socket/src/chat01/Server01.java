package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
//		서버 소켓
		ServerSocket serverSocket = null;
		
//		클라이언트 소켓
		Socket socket = null;
		
//		입력 스트림을 읽기 위한 BufferedReader
		BufferedReader reader = null;
		
		String message = null;
		
		
//		무조건 사용한 포트를 닫아야 하기 떄문에 finally 사용해야 함
		try {
			serverSocket = new ServerSocket(5555);
			System.out.println("서버가 시작되었습니다. 클라이언트를 기다리는 중");
			
//			서버 쪽에 요청이 들어오면 그 요청을 시작하는 것!
//			bind(묶어주는 것)
			socket = serverSocket.accept();
			System.out.println("클라이언트가 연결되었습니다.");
			
//			버퍼가 소켓이 가지고 있는 InputStream을 reader에게 연결시켜서 버퍼한테 연결
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			message = reader.readLine();
			System.out.println("클라이언트한테 받은 메세지 : ");
			System.out.println(message);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				
				if(serverSocket != null ) {
					
					serverSocket.close();
				}
				if(socket != null) {
					
					socket.close();
				}
				if(reader != null) {
					
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
