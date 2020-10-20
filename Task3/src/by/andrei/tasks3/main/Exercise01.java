package by.andrei.tasks3.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int n = 0;
		while (n <= 0) {
			System.out.println("Введите размер массива: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			n = sc.nextInt();
		}

		int k = 0;
		while (k <= 0) {
			System.out.println("Введите число, на которое будут делиться элементы без остатка: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			k = sc.nextInt();
		}

		int[] ms = new int[n];
		for (int i = 0; i < ms.length; i++) {
			ms[i] = rand.nextInt(100);
			System.out.println(ms[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < ms.length; i++) {
			if (ms[i] % k == 0) {
				sum = sum + ms[i];
			}
		}
		if (sum != 0) {
			System.out.print("Сумма элементов, кратные числу " + k + " = " + sum);			
		} else {
			System.out.println("В массиве отсутствуют элементы, кратные числу " + k);
		}
	}

}
