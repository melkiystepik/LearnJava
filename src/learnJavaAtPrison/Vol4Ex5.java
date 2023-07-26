/*
 * �������� ��������� � ����� �����������: ��� ��������� ������� �� ������������
 * ����� � ������, �� � ����� ���� ����� ������� ���, � � ������ �������
 * (���������: ��������� ����� ����� ���������� � 16������ ����). ���������� ���
 * ��� ��������� ����� ���������� ������������ �����������. ��� ������
 * ����������� ����������� ����� Integer.toBinaryString().
 * �� �� �� �����, ��������� ��������� �������� � ����������� �������� ���
 * ������ ����� � ������.
 */
package learnJavaAtPrison;

public class Vol4Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chisloRaz=0x0000; // ��������� � 0 � ������� ����
		int chisloDva=0x5555; // ��������� � 0 � ������� ����
		
		// ����������� �
		int result1 = chisloRaz & chisloDva;
		
		// ����������� ���
		int result2 = chisloRaz | chisloDva;
		
		// ����������� ����������� ���
		int result3 = chisloRaz ^ chisloDva;
		
		// ����������� ��
		int result4 = - chisloRaz;
		int result5 = - chisloDva;
		
		System.out.println("chisloRaz=0x0000, ��������� � 0 � ������� ����:" + chisloRaz + " = " + Integer.toBinaryString(chisloRaz));
		System.out.println("����������� �� chisloRaz:" + result4 + " = " + Integer.toBinaryString(result4));
		System.out.println("int chisloDva=0x5555, ��������� � 0 � ������� ����:" + chisloDva + " = " + Integer.toBinaryString(chisloDva));
		System.out.println("����������� �� chisloDva:" + result5 + " = " + Integer.toBinaryString(result5));
		System.out.println("����������� �: chisloRaz & chisloDva = " + result1 + " = " + Integer.toBinaryString(result1));
		System.out.println("����������� ���: chisloRaz | chisloDva = " + result2 + " = " + Integer.toBinaryString(result2));
		System.out.println("����������� ����������� ���: chisloRaz ^ chisloDva:"+ result3 + " = " + Integer.toBinaryString(result3));
			
	}

}
