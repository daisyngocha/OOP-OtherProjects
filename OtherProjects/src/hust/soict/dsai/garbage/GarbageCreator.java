package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {

	public static void main(String[] args) throws IOException {
		// Truyen duong dan file lon (vd: mot file .exe vai MB) qua args, hoac sua ten file o day
		String filename = args.length > 0 ? args[0] : "test.exe";
		byte[] inputBytes = { 0 };
		long startTime, endTime;

		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		String outputString = "";
		// Moi lan += tao 1 String moi, String cu thanh rac -> cham, file lon co the treo
		for (byte b : inputBytes) {
			outputString += (char) b;
		}
		endTime = System.currentTimeMillis();
		System.out.println("Bytes: " + inputBytes.length + " | Time: " + (endTime - startTime) + " ms");
	}
}
