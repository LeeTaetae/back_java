package chat03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		String name = "taehee";
		String ip = "192.168.5.254";
		
		try(
				Socket socket = new Socket(ip, 7777);
				PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
				BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedReader keyInput = new BufferedReader(new InputStreamReader(System.in))) 
		{
				
			System.out.println("서버와 연결 되었습니다.");
			ClientThread clientThread = new ClientThread(input);
			clientThread.start();
			
			String message = null;
			while((message = keyInput.readLine()) != null) {
				output.println(name + ": " + message);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}	

}

class ClientThread extends Thread {
    private BufferedReader input;

    public ClientThread() { ; }

    public ClientThread(BufferedReader input) {
        this.input = input;
    }

    @Override
    public void run() {
     String message= null;
     
     try {
		while((message = input.readLine()) != null) {
			 System.out.println(message);
		 }
		System.out.println("서버와의 연결이 종료되었습니다.");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("수신 종료");
	}
     
    }
    
}





