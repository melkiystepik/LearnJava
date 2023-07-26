/*глава 5 упр.5
 * Создать класс Dog (Собака) с перегруженным методом bark().
 * Метод должен быть перегружен для разных примитивных типо данных с целью
 * вывода сообщения о лае, завывании, поскуливании и т.д. в зависимости от
 * версии перегруженногоо метода. Напишите метод main(), вызывающий все версии.
 */

package learnJavaAtPrison;

import java.util.Scanner;

public class Dog {
	public static void bark() {
		System.out.println("barking");
	}
	public static void bark(int x) {
		System.out.println("лает "+x+" раз");
	}
	public static void bark(char w) {
		System.out.println("рычит букву " + w);
	}
	public static void bark(float a) {
		System.out.println("просит есть " + a);
	}
	public static void bark(String str) {
		System.out.println("говорит "+str);
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
