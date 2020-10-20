package by.andrei.tasks3.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise08 {

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
		int x = 0;
		while (x <= 0) {
			System.out.println("Введите число, больше которого необходимо вывести числа из мессива: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			x = sc.nextInt();
		}
		
		int max = ms[0];
		for (int i = 0; i < ms.length; i++) {
			if (max < ms[i]) {
				max = ms[i];
			}
		}
			
		if (max > x) {
			System.out.println("Элементы массива, которые больше числа " + x + ": ");
			for (int i = 0; i < ms.length; i++) {
				if (ms[i] > x) {
					System.out.print(" " + ms[i] + " ");
					
				}
			}			
		} else {
			System.out.println("Элементы массива, которые больше числа " + x + " отсутствуют.");
		}

	}

}
