package _20010310038_Kubilay_Karakaya_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Duzenleme {
 public long dizi []   ;
 public Kayit kayit;
 public HeapSort h1;
 private ArrayList<String> list;
 public  long stc;
 
 
 
 
 public void insert(Kayit kayitt) {
	 this.kayit=kayitt;
	 kayit.ekle();
	 long dizi [] =	 kayit.Getdizi();
 HeapSort h1=new HeapSort(dizi);
	 this.h1=h1;
	 this.kayit=kayit;
	 h1.Build_Max_Heap();
	 this.dizi=h1.dondur();
	
	 
	 
 }
 public void TcEkrana_yazdir() {
	 for(int i=0;i<kayit.dizi_Lenght();i++) {
		 System.out.print(dizi[i]+ ",");
	 }
 }
 
 public void Resize() {
	 long [] dizi2 =Arrays.copyOf(dizi, dizi.length*2);
	  this.dizi=dizi2; 
	  kayit.Setdizi(dizi2);
	 
	  
 }
 
 
 public void Return_Kayit_Sayisi() {
  h1.kayit_sayisi();
	 
 }
 public String bilgiler(long  ab ) {
     list=	 kayit.GetArrayList();
     int a=0;
	 String sayi2 = Long.toString(ab);
	 for(int  i=0;i<dizi.length;i++) {
		   String abc= list.get(i);	
		   if (abc.startsWith(sayi2)) {
			   a++;
			  return(abc.substring(11, abc.length()));
		   } 		   
		   }
	 if(a==1) {
		 
	 }
	 else {
		   System.out.println(" tc bulunamadý:" + ab);
		   return "" ;
	   }
	 return "";
	 }
 
 public void Ekrana_yazdir() {
		String isimS=bilgiler(stc);
		System.out.println("tc : "+ stc + " " + "Ad,soyad : " + isimS);
		
	}
 public int  index( long tc) {
		int b=0;
		for(int i=0;i<dizi.length;i++) {
			if(dizi[i]==tc) {
		
				return i;
			}		
		}
		return -1;
	}
 public long Delete (long tc) {
	 this.stc=tc;
	int index=index(tc);
	if(index!=-1) {
		h1.deleteRoot(index);
return tc;
	}
	else {
		System.out.println( " böyle bir tc bulunamamýþtýr :"  +  tc); 
		return (Long) null;
	}
	 
 }
 public void ButunVeri() {
	 kayit.listyazdirma();
 }
 
 public void  En_Buyuk_Kaydi_Cikar() {
	this.stc= h1.extractMax();
 }
 
 public void Delete_pos(int index) {
	this.stc= h1.deleteRoot(index);
 }
 public long  Search(long tc) {
	 this.stc=tc;
	 //Ekrana_yazdýr();
	 
	 
	 return tc;
	 
 }
 
 public void Return_Seviye_Sayisi() {
	 
	 System.out.println(Math.getExponent(h1.heap_size)); 
   
 }
 
 
 public  void menu () {
	 
	 Scanner deger=new Scanner(System.in);
	 System.out.println( "yapmak istediðiniz iþlemin numarasýný yazýnýz :");
	 System.out.println("1 : Tc numarasý girerek bilgileri öðrenme");
	 System.out.println("2 : Dizide ki en büyük verinin bilgilerini öðrenme ve dizinden çýkarma ");
	 System.out.println("3 : index verisi girilen deðerleri ögrenme ve diziden çýkarma");
	 System.out.println("4 : Sadece Tc  verilerini  ekrana yazdýrma");
	 System.out.println("5 : Bütün verileri ekrana yazdýrma");
	 
	 
	 int  in=deger.nextInt();
	 
	 
	 switch(in) {
	 case 1 :
			System.out.println("Tc giriniz :");
		    long tc= deger.nextLong();
		    String sayi2 = Long.toString(tc);
		    Long l1 = Long.parseUnsignedLong(sayi2);
		    Search(l1);
		 break;
	 case 2 :
		 En_Buyuk_Kaydi_Cikar();
		 Ekrana_yazdir();
		 break;
	 case 3 :
		 System.out.println("index no giriniz :");
		  int index=deger.nextInt();
		  Delete_pos(index);
		  Ekrana_yazdir();
		  break;
	 case 4 :
		 TcEkrana_yazdir();
		 break;
	 case 5:
		 ButunVeri();
		 break;
	 }
 }
 

}
