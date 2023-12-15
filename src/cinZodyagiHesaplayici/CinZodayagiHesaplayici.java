package cinZodyagiHesaplayici;

import java.security.PublicKey;
import java.util.Scanner;

public class CinZodayagiHesaplayici {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Dogum yiliniz nedir: ");
		int dogumYili = scanner.nextInt();
		
		
		String cinZodyagi = hesaplaCinZodyagi (dogumYili);
		
		System.out.println("Cin zodayagi burcunuz: " + cinZodyagi);
		
		scanner.close();
		}
	
	public static String hesaplaCinZodyagi(int yil) {
		
		String [] zodyakListesi ={"Maymun", "Horoz", "Kopek", "Domuz", "Fare", "Okuz", "Tiger", "Tavsan", "Ejderha", "Yilan", "At", "Koyun" };
		int indeks = yil % 12;
		return zodyakListesi[indeks];
	
	}

}
