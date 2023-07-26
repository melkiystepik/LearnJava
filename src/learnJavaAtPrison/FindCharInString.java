package learnJavaAtPrison;

public class FindCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "—эм шел через лес, он заметил несколько птиц, летающих у него над головой и сид€щих на ветках. Ёто его не удивило, так как была середина лета. Ѕыл только еще один знак того, что что-то очень странное произошло здесь недавно. ќн решил узнать, что же это было";

		int count =0;
		String[] words = str.split(" ");
		for (String word : words) {
			for (char bukva : word.toCharArray()) {
				if ((bukva == 'у')) {
						count++;
						System.out.println(word);
						
				}
			}
		}
		
		System.out.println(count);
	}

}
