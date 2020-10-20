package by.andrei.tasks3.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		int[] array = {0, 1, 5, 7, 0, 8, 0};
		int[] array2 =  {3, -32, 0, 543, 0, 0};
		int[] array3 =  {4, 5, 5, 5, 4};
		numberMass(array);
		numberMass(array2);
		numberMass(array3);
	}
	
	public static void numberMass (int[]ms) {
		int k = 0;	//размер массива
		for (int i = 0; i < ms.length; i++) {
			if (ms[i] == 0) {
				k++;
			}
		}		
		
		int[] array4 = new int[k];
		System.out.println("В массиве: ");
		for (int i = 0; i < ms.length; i++) {
			System.out.print(" " + ms[i] + " ");			
		}
		System.out.print("\n");
		int m = 0;
		for (int i = 0; i < ms.length; i++) {
			if (ms[i] == 0) {
				m++;
			}
		}
		if (m != 0) {
			m = 0;
			System.out.print("Нулевые элементы под номерами: ");
			for (int i = 0; i < ms.length; i++) {
				if (ms[i] == 0) {
					array4[m] = i;
					System.out.print(" " + array4[m] + " ");
					m++;
				}
			}
			System.out.print("\n\n");
		} else {
			System.out.print("Нулевые элементы отсутствуют.");
		}
		
	}
	
}
