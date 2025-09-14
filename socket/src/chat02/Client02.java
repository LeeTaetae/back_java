package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) {
		
		Socket socket = null;
		BufferedReader in = null; 
		PrintWriter out = null;
		Scanner sc = new Scanner(System.in);
		
//		localhost
		try {
			socket = new Socket("localhost", 7778);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			
			while(true) {
				System.out.println("클라이언트에서 서버로 데이터 보내기 >>");
				String outMessage = sc.nextLine();
				
				out.println(outMessage );
				
				
				String inMessage = in.readLine();
				if(inMessage == null) break;
				System.out.println("서버 >>" + inMessage);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(socket != null) {
					socket.close();
				}
				
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
				if(sc != null) {
					sc.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
