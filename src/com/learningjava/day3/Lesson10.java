package com.learningjava.day3;

import java.util.Scanner;
public class Lesson10 {
	
	private static Scanner input = new Scanner(System.in);
    //Primitive Data types
	public static void main(String [] args) {
		String str = input.nextLine();
		
		showLiterals(str);
       
	}
	
	static void showLiterals(String str) {
		int value=Integer.parseInt(str);
		
		String binary = getLiteralNumber(value,2);
		System.out.printf("Binary Number of %d is %s %n",value,binary);
		System.out.printf("%s = %d%n",binary,Integer.valueOf(binary,2));
		//System.out.println(Integer.toBinaryString(267));
		
		String octal = getLiteralNumber(value,8);
		System.out.printf("Octal Number of %d is %s %n",value,octal);
		System.out.printf("%s = %d%n",octal,Integer.valueOf(octal,8));
		
		String hex = getLiteralNumber(value,16);
		System.out.printf("Hexdecimal Number of %d is %s %n",value,hex);
		System.out.printf("%s = %d%n",hex,Integer.valueOf(hex,16));
		
		
	}
	
	static String getLiteralNumber(int convertNumber,int format) {
		StringBuilder sb = new StringBuilder();
		while(convertNumber > 0) {
			int remainer = convertNumber % format;
			sb.append(format ==16 ? getHex(remainer) : remainer);
			convertNumber = (convertNumber / format);
		}
		
		    sb.reverse();
		    sb.insert(0, getPrefix(format));
		    return sb.toString();
	}
	static String getHex(int value) {
		String [] values = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		return values[value];
	}
	static String getPrefix(int format) {
		String prefix = null;
		switch (format) {
		case 2:
			prefix = "";
			break;
		case 8:
			prefix = "0";
			break;
		case 16:
			prefix = "";
			break;
		default :
			break;
		
		}
		return prefix;
	}
}