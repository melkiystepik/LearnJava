package learnJavaAtPrison;

public class FindCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "��� ��� ����� ���, �� ������� ��������� ����, �������� � ���� ��� ������� � ������� �� ������. ��� ��� �� �������, ��� ��� ���� �������� ����. ��� ������ ��� ���� ���� ����, ��� ���-�� ����� �������� ��������� ����� �������. �� ����� ������, ��� �� ��� ����";

		int count =0;
		String[] words = str.split(" ");
		for (String word : words) {
			for (char bukva : word.toCharArray()) {
				if ((bukva == '�')) {
						count++;
						System.out.println(word);
						
				}
			}
		}
		
		System.out.println(count);
	}

}
