/*
 * �����5 ���.6
 * ��� ������������� ������ ��������� ��� ��������� ������ ����� � ����������
 * ������ �������� �� ���������� � ������ ����������. 
 */

package learnJavaAtPrison;

import java.util.Scanner;

public class Vol5Ex6 {
	static int chislo;
	static String slovo = "";
	public static void peregruzka(int chislo, String slovo) {
		System.out.println("������� �����, �� ��� �����:"
							+ chislo + ", " + slovo);
	}
	public static void peregruzka(String slovo, int chislo) {
		System.out.println("������� �����, �� ��� �����:"
							+ slovo + ", " + chislo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������� �����:");
		Scanner scan=new Scanner(System.in);
		slovo=scan.nextLine();
		System.out.println("������� ����� �����:");
		chislo=scan.nextInt();
		peregruzka(chislo, slovo);
		peregruzka(slovo, chislo);
	}
}
