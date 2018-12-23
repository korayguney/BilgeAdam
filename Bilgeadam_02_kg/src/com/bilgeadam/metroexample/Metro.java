package com.bilgeadam.metroexample;

import java.util.Scanner;

public class Metro {
	// test test

	static double bakiye = 0;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int secim = 0;
		do {
			System.out.println("1- Kartýma para yükle");
			System.out.println("2- Kart bakiyemi görüntüle");
			System.out.println("3- Metroya bin");
			System.out.println("4- Sistemden çýk");

			secim = input.nextInt();

			switch (secim) {
			case 1:
				bakiyeYukle();
				break;
			case 2:
				bakiyeGoruntule();
				break;
			case 3:
				metroyaBin();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}

		} while (secim != 4);

	}


	static void bakiyeYukle() {
		System.out.println("Yüklemek istediðiniz miktarý giriniz: ");
		double yuklenecekBakiye = input.nextDouble();
		bakiye += yuklenecekBakiye;
	}

	static void bakiyeGoruntule() {
		System.out.println("Kart bakiyeniz : " + bakiye);
	}

	static void metroyaBin() {
		
		System.out.println("1- Tam kart");
		System.out.println("2- Ýndirimli kart");
		
		int secim = input.nextInt();
		
		if (secim == 1) {
			if (bakiye >= 2.60) {
				bakiye = bakiye - 2.60;
				System.out.println("Kalan bakiyeniz : " + bakiye);
				System.out.println("Kadýköy-Tavþantepe Metrosu... Lütfen inenlere öncelik veriniz!");
			} else {
				System.out.println("Kalan bakiyeniz : " + bakiye);
				System.out.println("Yetersiz bakiye!");
			}
		} else if (secim == 2) {
			if (bakiye >= 1.25) {
				bakiye = bakiye - 1.25;
				System.out.println("Kalan bakiyeniz : " + bakiye);
				System.out.println("Kadýköy-Tavþantepe Metrosu... Lütfen inenlere öncelik veriniz!");
			} else {
				System.out.println("Kalan bakiyeniz : " + bakiye);
				System.out.println("Yetersiz bakiye!");
			}
		}
	}
	
	
	
}
