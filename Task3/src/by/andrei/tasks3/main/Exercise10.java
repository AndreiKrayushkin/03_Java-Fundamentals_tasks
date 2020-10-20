package by.andrei.tasks3.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise10 {

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
			ms[i] = rand.nextInt(100);
			System.out.print(ms[i] + " ");
		}
		
		int maxSum = ms[0] + ms[ms.length - 1];
		for (int i = 1; i < ms.length / 2; i++) {
			if (((ms[i] + ms[ms.length - 1 - i])) > maxSum ) {
				maxSum = (ms[i] + ms[ms.length - i - i]);
			}
		}
		System.out.print("\n");
		System.out.println("Максимальная сумма: " +  maxSum);
	}

}
