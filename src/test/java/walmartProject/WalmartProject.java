package walmartProject;

import java.util.ArrayList;
import java.util.Scanner;

public class WalmartProject {

	public static void main(String[] args) {
		printItems();
		ArrayList<Integer> order = getOrder();

		int amt = calculateamt(order);
		System.out.println("total amount: " + amt);

	}

	private static int calculateamt(ArrayList<Integer> order) {
		int total = 0;
		for (int a : order) {
			if (a == 1) {
				total = total + 5;
			} else if (a == 2) {
				total = total + 2;
			} else if (a == 3) {
				total = total + 6;
			} else if (a == 4) {
				total = total + 10;
			} else if (a == 5) {
				total = total + 4;
			} else if (a == 7) {
				total = total + 7;
			} else if (a == 6) {
				total = total + 3;
			}
		}
		return total;
	}

	private static ArrayList<Integer> getOrder() {
		ArrayList<Integer> res=new ArrayList<Integer>();
		System.out.println("Enter item number and to exit press 0");
		Scanner sc=new Scanner(System.in);
		int num=1;
		while(num!=0) {
			num = sc.nextInt();
			res.add(num);
		}
		sc.close();
		return res;
	}

	private static void printItems() {
		System.out.println("1:Mango juice-----$5");
		System.out.println("2:carrot juice-----$2");
		System.out.println("3:Watermelon juice-----$6");
		System.out.println("4:Orange juice-----$10");
		System.out.println("5:muskmelon juice-----$4");
		System.out.println("6:Mango juice-----$3");
		System.out.println("7:Apple juice----$7");

	}

}
