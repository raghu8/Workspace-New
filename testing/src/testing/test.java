package testing;

import java.util.*;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("java maps");
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("Zara", 8);
		m1.put("Mahnaz", 31);
		m1.put("Ayan", 12);
		m1.put("Daisy", 14);
		System.out.println();
		System.out.println(" Map Elements");
		System.out.print("\t" + m1);
	}
}