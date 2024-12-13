package _20010310038_Kubilay_Karakaya_;

import java.io.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		long [] dizi1= new long [2500];
		Scanner input=new Scanner(new File ("C:\\Users\\Casper\\eclipse-workspace\\_20010310038_Kubilay_Karakaya_\\kayit_dosyasi.txt"));
	Kayit kayit= new Kayit(input ,dizi1);
	Duzenleme liste= new Duzenleme();
liste.insert(kayit);
liste.Resize();
liste.insert(kayit);
liste.Return_Kayit_Sayisi();
Long l1 = Long.parseUnsignedLong("7756591263");
liste.Delete(l1);
liste.Ekrana_yazdir();
liste.Return_Kayit_Sayisi();
liste.En_Buyuk_Kaydi_Cikar();
liste.Ekrana_yazdir();
liste.Delete_pos(43);
liste.Ekrana_yazdir();
Long l2 = Long.parseUnsignedLong("9377761894");
liste.Search(l2);
liste.Ekrana_yazdir();
liste.Return_Kayit_Sayisi();
liste.Return_Seviye_Sayisi();


//liste.menü();

	}
	}
