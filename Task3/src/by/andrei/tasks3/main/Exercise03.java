package by.andrei.tasks3.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		int[] ms1 = {1, 2, 3, 4, 5, 5};
		int[] ms2 = {-3, 76, 78, 333};
		int[] ms3 = {3, 5, 3, 1};
		upper(ms1);
		upper(ms2);
		upper(ms3);
	}
	public static void upper (int [] ms) {
		boolean flag = false;
		System.out.print("Массив: ");
		for (int i = 0; i < ms.length; i++) {
			System.out.print(" " + ms[i] + " ");
		}
		int x = ms[0];
		for (int i = 0; i < ms.length; i++) {
			if (x <= ms[i]) {
				x = ms[i];
			} else {
				flag = true;
				break;
			}		
		}		
		if(!flag) {
			System.out.print("Массив возрастающий");
		} else {
			System.out.print("Массив не возрастающий");
		}
		System.out.println("\n");
	}
}
