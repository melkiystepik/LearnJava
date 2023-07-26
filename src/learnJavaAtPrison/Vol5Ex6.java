/*
 * Глава5 упр.6
 * Два перегруженных метода принимают два аргумента разных типов и отличаются
 * только порядком их следования в списке аргументов. 
 */

package learnJavaAtPrison;

import java.util.Scanner;

public class Vol5Ex6 {
	static int chislo;
	static String slovo = "";
	public static void peregruzka(int chislo, String slovo) {
		System.out.println("Сначала число, за ним слова:"
							+ chislo + ", " + slovo);
	}
	public static void peregruzka(String slovo, int chislo) {
		System.out.println("Сначала слова, за ним число:"
							+ slovo + ", " + chislo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите слова:");
		Scanner scan=new Scanner(System.in);
		slovo=scan.nextLine();
		System.out.println("Введите целое число:");
		chislo=scan.nextInt();
		peregruzka(chislo, slovo);
		peregruzka(slovo, chislo);
	}
}
