package learnJavaAtPrison;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "��� �������� ������� ������� �� ����� ������� � ���������� ����� � �������� ������������� ������, ��� ����������� ���� ����� ������ � ���� �������� ������� ����� ����� ���. ������� �� ������ ������������ ������ ������������ ����� ������ ���� �������������� ����������������� � ������ �������";
		int len = str.length();
		int count =0;
		for (char bukva : str.toCharArray()) {
			if ((bukva == '�') || (bukva == '�')) {
					count++;
			}
		}
		System.out.println(count);
	}

}
