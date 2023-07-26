/*
 * Напишите программу с двумя константами: обе константы состоят из чередующихся
 * нулей и единиц, но у одной нулю равен младший бит, а у другой старший
 * (подсказка: константы проще всего определить в 16ричном виде). Объедините эти
 * две константы всеми возможными поразрядными операторами. Для вывода
 * результатов используйте метод Integer.toBinaryString().
 * Всё то же самое, используя тернарный оператор и поразрядную проверку для
 * вывода нолей и единиц.
 */
package learnJavaAtPrison;

public class Vol4Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chisloRaz=0x0000; // константа с 0 в младшем бите
		int chisloDva=0x5555; // константа с 0 в старшем бите
		
		// Поразрядное И
		int result1 = chisloRaz & chisloDva;
		
		// Поразрядное ИЛИ
		int result2 = chisloRaz | chisloDva;
		
		// Поразрядное исключающее ИЛИ
		int result3 = chisloRaz ^ chisloDva;
		
		// Поразрядное НЕ
		int result4 = - chisloRaz;
		int result5 = - chisloDva;
		
		System.out.println("chisloRaz=0x0000, константа с 0 в младшем бите:" + chisloRaz + " = " + Integer.toBinaryString(chisloRaz));
		System.out.println("Поразрядное НЕ chisloRaz:" + result4 + " = " + Integer.toBinaryString(result4));
		System.out.println("int chisloDva=0x5555, константа с 0 в старшем бите:" + chisloDva + " = " + Integer.toBinaryString(chisloDva));
		System.out.println("Поразрядное НЕ chisloDva:" + result5 + " = " + Integer.toBinaryString(result5));
		System.out.println("Поразрядное И: chisloRaz & chisloDva = " + result1 + " = " + Integer.toBinaryString(result1));
		System.out.println("Поразрядное ИЛИ: chisloRaz | chisloDva = " + result2 + " = " + Integer.toBinaryString(result2));
		System.out.println("Поразрядное исключающее ИЛИ: chisloRaz ^ chisloDva:"+ result3 + " = " + Integer.toBinaryString(result3));
			
	}

}
