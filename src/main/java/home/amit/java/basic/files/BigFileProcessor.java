package home.amit.java.basic.files;
/*
User :- AmitSingh
Date :- 7/4/2023
Time :- 10:13 AM
Year :- 2023
Reference :- https://www.baeldung.com/java-read-lines-large-file
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.stream.Stream;

public class BigFileProcessor {

    public void processByStreamAPi(String filepath) throws IOException {
        try (Stream<String> lines = java.nio.file.Files.lines(Paths.get(filepath))) {
            lines.forEach(line -> {
                System.out.println(line);
                // do something with each line
            });
        }

    }

    public void processByScanner(String filepath) throws Exception {
        FileInputStream inputStream = null;
        Scanner sc = null;
        try {
            inputStream = new FileInputStream(filepath);
            sc = new Scanner(inputStream, StandardCharsets.UTF_8);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
            }
            // note that Scanner suppresses exceptions
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }


    }

    public void processBySeekableByteChannel(String filepath) {
        try (SeekableByteChannel ch = java.nio.file.Files.newByteChannel(Paths.get(filepath), StandardOpenOption.READ)) {
            ByteBuffer bf = ByteBuffer.allocate(1000);
            while (ch.read(bf) > 0) {
                bf.flip();
                System.out.println(new String(bf.array()));
                bf.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void processByBufferedReader(String filepath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            while (br.readLine() != null) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {

        String filepath = "F:\\Amit\\Development\\Workspace-stuff\\BigFile.txt";
        BigFileProcessor bigFileProcessor = new BigFileProcessor();
        try {
            bigFileProcessor.processByStreamAPi(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
