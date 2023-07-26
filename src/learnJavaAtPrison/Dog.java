/*����� 5 ���.5
 * ������� ����� Dog (������) � ������������� ������� bark().
 * ����� ������ ���� ���������� ��� ������ ����������� ���� ������ � �����
 * ������ ��������� � ���, ���������, ������������ � �.�. � ����������� ��
 * ������ ��������������� ������. �������� ����� main(), ���������� ��� ������.
 */

package learnJavaAtPrison;

import java.util.Scanner;

public class Dog {
	public static void bark() {
		System.out.println("barking");
	}
	public static void bark(int x) {
		System.out.println("���� "+x+" ���");
	}
	public static void bark(char w) {
		System.out.println("����� ����� " + w);
	}
	public static void bark(float a) {
		System.out.println("������ ���� " + a);
	}
	public static void bark(String str) {
		System.out.println("������� "+str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog beast = new Dog();
		beast.bark();
		beast.bark(7);
		beast.bark('x');
		beast.bark(23.34f);
		beast.bark("x");
	}

}
