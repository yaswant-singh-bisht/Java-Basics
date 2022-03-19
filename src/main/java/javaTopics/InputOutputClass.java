package javaTopics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutputClass {

	public static void main(String[] args) throws IOException {
		System.out.println("System.out example");
		System.err.println("System.err example");
		
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Scanner - Enter Name");
		System.out.println("Scanner - Name is "+sr.next());
		System.out.println("Scanner - Enter Id");
		System.out.println("Scanner - Id is "+sr.nextInt());
		System.out.println("Scanner - Enter Float value");
		System.out.println("Scanner - Float value is "+sr.nextFloat());
		System.out.println("Scanner - Enter Double value");
		System.out.println("Scanner - Double value is "+sr.nextDouble());
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("BufferedReader - Enter Name");
		System.out.println("BufferedReader - Name is "+br.readLine());
		System.out.println("BufferedReader - Enter Id");
		System.out.println("BufferedReader - Id is "+ Integer.parseInt(br.readLine()));
		System.out.println("BufferedReader - Enter Float value");
		System.out.println("BufferedReader - Float value is "+ Float.parseFloat(br.readLine()));
		System.out.println("BufferedReader - Enter Double value");
		System.out.println("BufferedReader - Double value is "+ Double.parseDouble(br.readLine()));
		
		String fp = System.getProperty("user.dir")+"/TestData/BufferedReaderFile.txt";
		FileReader fr = new FileReader(fp);
		BufferedReader brf = new BufferedReader(fr);
		
		System.out.println("BufferedReader - Input file text --> " + brf.readLine());
		
		
		
		
		
	}

}
