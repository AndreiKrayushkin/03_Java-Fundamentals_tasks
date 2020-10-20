package by.andrei.tasks3.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		int sizeMs = 0;
		while (sizeMs <= 0) {
			System.out.println("Введите размер массива: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			sizeMs = sc.nextInt();
		}
		
		int[] ms = new int[sizeMs];
		System.out.println("Массив: ");
		for (int i = 0; i < ms.length; i++) {
			ms[i] = rand.nextInt(100);
			System.out.print(" " + ms[i] + " ");
		}
		
		int counter = 0;
		for (int i = 0; i <ms.length; i++) {
			if (ms[i] % 2 == 0) {
				counter++;
			}
		}
		int[] ms2 = new int[counter];
		int sizeArrayNew = 0;
		for (int i = 0; i <ms.length; i++) {
			if (ms[i] % 2 == 0) {
				ms2[sizeArrayNew] = ms[i];
				sizeArrayNew++;
			} 
		}
		System.out.println("\n");
		if (sizeArrayNew != 0) {
			System.out.println("Четные числа массива: ");
			for (int i = 0; i < ms2.length; i++) {
				System.out.println(" " + ms2[i] + " ");
			}
		}
		if (sizeArrayNew == 0) {
			System.out.println("Четные числа отсутствуют!");
		}
	}

}
