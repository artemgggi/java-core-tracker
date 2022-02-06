package ru.job4j.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class EchoServer {
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(9000)) {
			while (!server.isClosed()) {
				Socket socket = server.accept();
				try (OutputStream out = socket.getOutputStream();
				     BufferedReader in = new BufferedReader(
						     new InputStreamReader(socket.getInputStream()))) {
					out.write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
					String str = in.readLine();
					if (str.contains("Exit")) {
						server.close();
					} else if (str.contains("Hello")) {
						out.write("Hello, dear friend.".getBytes());
					} else if (str.contains("Any")) {
						out.write("What.".getBytes());
					}
					for (str = in.readLine(); str != null && !str.isEmpty(); str = in.readLine()) {
						System.out.println(str);
					}
					out.flush();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
