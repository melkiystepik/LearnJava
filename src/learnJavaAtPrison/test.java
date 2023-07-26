package learnJavaAtPrison;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Без защитных средств человек не может прожить и нескольких минут в Северном Атлантическом Океане, где температура воды часто близка к нулю градусов Цельсия почти целый год. Поэтому по закону спасательные шлюпки пассажирских судов должны быть укомплектованы водонепроницаемой и теплой одеждой";
		int len = str.length();
		int count =0;
		for (char bukva : str.toCharArray()) {
			if ((bukva == 'о') || (bukva == 'О')) {
					count++;
			}
		}
		System.out.println(count);
	}

}
