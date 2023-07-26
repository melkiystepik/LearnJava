/*
 * Вывести на экран указанное число чисел Фибоначчи (1, 1, 2, 3, 5, 8, 13...)
 */

package learnJavaAtPrison;
import java.util.Scanner;


public class Vol4Ex23 {
	static StringBuffer ray = new StringBuffer();

	static int a=3, b=5, c=8; //4-й, 5-й и 6-й элементы в ряду	
	public static StringBuffer fiba(int length) {
		for (int i=7; i<=length;i++) {
			a=b;
			b=c;
			c=a+b;
			ray.append(", ").append(c);
		}
		return ray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var ray = new Stringbuffer("");
		ray.append("1, 1, 2");
		System.out.println("Сколько чисел будем выводить?");
		int n = new Scanner(System.in).nextInt();

		switch (n) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println("1, 1");
			break;
		case 3:
			System.out.println(ray);
			break;
		case 4:
			ray.append(", ").append(a);
			System.out.println(ray);
			break;
		case 5:
			ray.append(", ").append(a).append(", ").append(b);
			System.out.println(ray);
			break;
		default:  
			ray.append(", ").append(a).append(", ").append(b).append(", ").append(c);
			if (n > 6) fiba (n);
			System.out.println(ray);
		}
	}
}
