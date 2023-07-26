/*
 * Напишите программу, использующую два вложенных цикла for и оператор остатка %
 * для поиска и вывода простых чисел 
 */

package learnJavaAtPrison;

import java.util.Scanner;

public class Vol4Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("сколько чисел будем перебирать? ");
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		System.out.println("числа: ");
		int [] chisla = new int [len];
		for (int i=0; i<len; i++) {
			chisla[i]=new Scanner(System.in).nextInt();
		}
		for (int n=0;n<len;n++) {
			int k=0;
			for (int i=1;i<chisla[n];i++) {
				if ((chisla[n])%i==0) k++;
			}
			if ((k==2)||(k==1))
				System.out.println(""+chisla[n]+" - простое");
		}
	}
}
