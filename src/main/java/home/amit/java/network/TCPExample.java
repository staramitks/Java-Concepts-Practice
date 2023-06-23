package home.amit.java.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPExample {
    public static void main(String[] args) throws Exception {

        int c;
        try (Socket s = new Socket("whois.internic.net", 43)) {

            InputStream inputStream = s.getInputStream();
            OutputStream outputStream = s.getOutputStream();

            String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";
            byte[] buf = str.getBytes();
            outputStream.write(buf);

            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }

        }

    }
}
