package hust.soict.dsai.garbage;

import java.util.Random;

public class ConcatenationInLoops {

	public static void main(String[] args) {
		final int N = 65536;

		// 1. String + operator
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < N; i++)
			s += r.nextInt(2);
		System.out.println("String +       : " + (System.currentTimeMillis() - start) + " ms");

		// 2. StringBuilder
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++)
			sb.append(r.nextInt(2));
		s = sb.toString();
		System.out.println("StringBuilder  : " + (System.currentTimeMillis() - start) + " ms");

		// 3. StringBuffer
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < N; i++)
			sbf.append(r.nextInt(2));
		s = sbf.toString();
		System.out.println("StringBuffer   : " + (System.currentTimeMillis() - start) + " ms");
	}
}
