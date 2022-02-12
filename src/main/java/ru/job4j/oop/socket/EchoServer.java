package ru.job4j.oop.socket;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.job4j.UsageLog4j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServer {

	private static final Logger LOG = LoggerFactory.getLogger(UsageLog4j.class.getName());

	public static void main(String[] args) {
		String log4jConfPath = "src/main/resources/log4j.properties.properties";
		PropertyConfigurator.configure(log4jConfPath);
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
			LOG.error("Exception in log example", e);
		}
	}
}
