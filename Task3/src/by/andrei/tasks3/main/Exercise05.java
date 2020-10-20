package by.andrei.tasks3.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise05 {

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
		
		int max = ms[0];
		for (int i = 0; i < ms.length; i++) {
			if (max < ms[i]) {
				max = ms[i];
			}
		}
		System.out.print("\n");
		System.out.println("max = " + max);
		
		int min = ms[0];
		for (int i = 0; i < ms.length; i++) {
			if (min > ms[i]) {
				min = ms[i];
			}
		}
		System.out.println("min = " + min);
		int lengthLine = max - min;
		System.out.println("Length = " + lengthLine);
	}
}
