package by.andrei.tasks3.main;

import java.util.Scanner;
import java.util.Random;

public class Exercise09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n <= 0) {
			System.out.println("Введите размер массива: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			n = sc.nextInt();
		}
		
		Random rand = new Random();
		int[] ms = new int[n];
		System.out.println("Массив: ");
		for (int i = 0; i <ms.length; i++) {
			ms[i] = rand.nextInt(100)-50;
			System.out.print(ms[i] + " ");
		}
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		for (int i = 0; i <ms.length; i++) {
			if(ms[i] < 0) {
				x1++;
			}
		}
		for (int i = 0; i <ms.length; i++) {
			if(ms[i] > 0) {
				x2++;
			}
		}
		for (int i = 0; i <ms.length; i++) {
			if(ms[i] == 0) {
				x3++;
			}
		}
		System.out.print("\n");
		System.out.println("Количество отрицательных элементов: " + x1);
		System.out.println("Количество положительных элементов: " + x2);
		System.out.println("Количество нулевох элементов: " + x3);
	}

}
