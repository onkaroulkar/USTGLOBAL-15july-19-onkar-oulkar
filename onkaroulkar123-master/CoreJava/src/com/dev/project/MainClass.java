package com.dev.project;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception {

		MethodImplementation obj = new MethodImplementation();

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("Press 1 for play a song");
		System.out.println("Press 2 for search song");
		System.out.println("Press 3 for show all song");
		System.out.println("Press 4 for oprate on song database");

		int ch = scanner.nextInt();
		switch (ch) {
		case 1:
			System.out.println("enter your choice");
			System.out.println("Press 1 for play all song");
			System.out.println("Press 2 for play song randumaly");
			System.out.println("Press 3 for play a perticular song");

			int ch1 = scanner.nextInt();
			switch(ch1)
			{
			case 1:
				obj.playAllSong();
				break;
			case 2:
				obj.playSongRandomly();
				break;
			case 3:
			    obj.playPerticularSong();
				break;
			default:
				System.out.println("enter correct choice");
				break;
			}
			break;
		case 2:
			obj.searchSong();
			break;
		case 3:
			obj.showAllSong();
			break;
		case 4:
			System.out.println("enter your choice");
			System.out.println("Press 1 for add song");
			System.out.println("Press 2 for edite song");
			System.out.println("Press 3 for delete somg");

			int ch2 = scanner.nextInt();
			switch(ch2)
			{
			case 1:
				obj.addSong();
				break;
			case 2:
				obj.editeSong();
				break;
			case 3:
			    obj.deleteSong();
				break;
			default:
				System.out.println("enter correct choice");
				break;
			}
			
			
			break;
		default:
			System.out.println();
			break;

		}

	}

}
