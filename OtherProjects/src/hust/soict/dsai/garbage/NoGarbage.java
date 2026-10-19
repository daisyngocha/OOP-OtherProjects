package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {

	public static void main(String[] args) throws IOException {
		String filename = args.length > 0 ? args[0] : "test.exe";
		byte[] inputBytes = { 0 };
		long startTime, endTime;

		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		// Dung 1 buffer co the thay doi -> khong sinh String trung gian
		StringBuffer outputStringBuffer = new StringBuffer();
		for (byte b : inputBytes) {
			outputStringBuffer.append((char) b);
		}
		String outputString = outputStringBuffer.toString();
		endTime = System.currentTimeMillis();
		System.out.println("Bytes: " + inputBytes.length + " | Time: " + (endTime - startTime) + " ms");
	}
}
