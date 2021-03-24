package tasks.taskOne;

public class TaskOne {
	/*
	 Задания из слайда 102
	 */

	public static void main(String[] args) {
		int a = 20;
		int b = 35;
		int c = 20;
		int d;
		
		if (a != b) {
			System.out.println(a);
		}
		
		if (b > a) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
		
		if (a <= c) {
			if (a == c) {
				System.out.println("Они равны");
			} else if (a < c) {
				System.out.println("'a' меньше 'c'");
			}
		}
		
		if (a >= b) {
			d = b % a;
		}
		
		if ((a == c) & (a < b)) {
			System.out.println("true");
		}
		
		if ((a < b) | (a > c)) {
			System.out.println("true");
		}
		
		if ((a < b) ^ (a < c)) {
			System.out.println("true");
		}
		
		if (!(a < b) ^ (a < c)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		switch (a) {
			case 13 :
				a = 125;
				System.out.println(a);
				break;
			case 9 :
				a *= 2;
				System.out.println(a);
				break;
			case 125 :
				a += b;
				System.out.println(a);
				break;
			case 20 :
				a++;
				System.out.println(a);
				break;
		}
		
		
	}

}
