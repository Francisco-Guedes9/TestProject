package testes;

import java.util.Scanner;

public class TestsRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Word:");
		String str = sc.nextLine();

		String reversedStr = "";
		char ch;

		for (int i = str.length() - 1; i >= 0; i--) {

			ch = str.charAt(i);

			reversedStr = reversedStr + ch;

			}

		System.out.println(reversedStr);
		}
		
	}
