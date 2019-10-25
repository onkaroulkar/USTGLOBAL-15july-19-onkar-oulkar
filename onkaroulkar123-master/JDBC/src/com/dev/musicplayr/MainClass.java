package com.dev.musicplayr;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception {

		Press1A obj = new Press1A();
		Press1B obj1 = new Press1B();
		Press1C obj2 = new Press1C();

		Press2 obj3 = new Press2();
		Press3 obj4 = new Press3();

		Press4A obj5 = new Press4A();
		Press4B obj7 = new Press4B();
		Press4C obj6 = new Press4C();

		System.out.println("select your option");
		System.out.println("press 1 to play a song");
		System.out.println("press 2 to search a song");
		System.out.println("press 3 to show all song");
		System.out.println("press 4 to oprate on song");
		System.out.println("********************************************");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("enter your choice");
			System.out.println("press 1 to play all song");
			System.out.println("press 2 to play all Randomly");
			System.out.println("press 3 to play all particular song");
			System.out.println("********************************************");

			int ch1 = sc.nextInt();
			switch (ch1) {
			case 1:
				obj.PlayAllSong();
				break;
			case 2:
				obj1.PlayRandom();
				break;
			case 3:
				obj2.searchSong();
				break;
			default:
				System.out.println("enter valid choice");
			}
			break;
		case 2:
			obj3.searchSong();
			break;
		case 3:
			obj4.showAll();
			break;
		case 4:
			System.out.println("enter your choice");
			System.out.println("press 1 to add song");
			System.out.println("press 2 to edite song");
			System.out.println("press 3 to delete song");

			int ch2 = sc.nextInt();
			switch (ch2) {
			case 1:
				obj5.addSong();
				break;
			case 2:
				obj7.editeSong();
				break;
			case 3:
				obj6.deleteSong();
				break;
			default:
				System.out.println("enter valid choice");
			}

			break;

		default:
			System.out.println("enter valid choice");

		}

	}

}
