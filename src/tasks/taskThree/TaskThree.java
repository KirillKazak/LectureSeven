package tasks.taskThree;

public class TaskThree {
	/*
	 ������� �� ������ 107
	*/

	public static void main(String[] args) {
		int month = 3; // ����
		String season; // ����� ����
		
		switch (month) {
		case 1 :
		case 2 :
		case 12 :
			season = "�������-����";
			break;
		case 3 :
		case 4 :
		case 5 :
			season = "�����";
			break;
		case 6 :
		case 7 :
		case 8 :
			season = "����";
			break;
		case 9 :
		case 10 :
		case 11 :
			season = "�����";
			break;
		default:
			season = "�� ����";
	}
		System.out.println (season);
	}

}
