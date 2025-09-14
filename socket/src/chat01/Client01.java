package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) {
//		포트번호 1100
//		192.168.161.32
		
		Socket socket = null;
		PrintWriter writer = null;
		
		String serverIp = "192.168.161.32";
		String message = null;
		
		try {
			socket = new Socket(serverIp, 5555);
			System.out.println("서버에 연결 되었습니다.");
			writer = new PrintWriter(socket.getOutputStream(), true);

			message = "안녕! 나는 최준서야! 나에게 무서운건 없지!";
			writer.println(message);
			System.out.println("서버로 [" + message  + "] 를 전송했습니다.");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(writer != null) {
					writer.close();
				}
				
				if(socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
 	