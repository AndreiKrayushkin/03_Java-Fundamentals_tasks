package by.andrei.tasks3.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise06 {

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
		for (int i = 0; i < ms.length; i++) {
			ms[i] = rand.nextInt(100);
			System.out.print(" " + ms[i] + " ");
		}
		System.out.print("\n");
		int k = 0;
		while (k <= 0) {
			System.out.println("Введите максимальное число в массиве: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			k = sc.nextInt();
		}
		
		int counter = 0;
		System.out.println("Новый массив: ");
		for (int i = 0; i < ms.length; i++) {
			if (ms[i] > k) {
				ms[i] = k;
				counter++;
			}
			System.out.print(" " + ms[i] + " ");
		}
		System.out.println("Количество замен в массиве: " + counter);
		
	}
}
