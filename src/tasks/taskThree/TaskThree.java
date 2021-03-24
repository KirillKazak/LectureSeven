package tasks.taskThree;

public class TaskThree {
	/*
	 Задания из слайда 107
	*/

	public static void main(String[] args) {
		int month = 3; // март
		String season; // время года
		
		switch (month) {
		case 1 :
		case 2 :
		case 12 :
			season = "Зимушка-зима";
			break;
		case 3 :
		case 4 :
		case 5 :
			season = "Весна";
			break;
		case 6 :
		case 7 :
		case 8 :
			season = "Лето";
			break;
		case 9 :
		case 10 :
		case 11 :
			season = "Осень";
			break;
		default:
			season = "Не знаю";
	}
		System.out.println (season);
	}

}
