package by.andrei.tasks3.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise07 {

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

		System.out.println("\n");
		bubbleSort(ms);
		System.out.println("Массив, отсортированный по возрастанию: ");
		for (int i = 0; i < ms.length; i++) {
			System.out.print(" " + ms[i] + " ");
		}
		
	}
	
	public static void bubbleSort(int[] ms) {
		for (int i = ms.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (ms[j] > ms[j+1]) {
					int rm = ms[j];
					ms[j] = ms[j+1];
					ms[j+1] = rm;
				}
			}
		}
		
	}
	
}
