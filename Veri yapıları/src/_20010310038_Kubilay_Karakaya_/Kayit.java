package _20010310038_Kubilay_Karakaya_;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {
 private String tc;
 private String ad;
  private String soyad;
  private long  dizi []  ;
   private int  dizi_size=0;
   private int j=0;
   private Scanner inputt ;
 
  
   public ArrayList<String> list = new ArrayList<String>();
   
   Kayit(Scanner input  , long  a []){
	   this.inputt=input;
	   this.dizi=a;
   } 
  public void   ekle ( ){
		int ab=dizi.length-j;
		 while(inputt.hasNextLine() && ab>=0 ){
			if(ab!=0) {
			 String str =inputt.nextLine();	
			list.add(str);
			 String[] tokens = str.split(",");	
				long abc = (long) Double.parseDouble(tokens[0]);
				dizi[j]= abc;
				ab--;
				j=j+1;
				setTc(tokens[0]);
				setAd(tokens[1]);
				setSoyad(tokens[2]);
			}
			else {
				break;	
			}	
		 }	
 }	
  public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public  long [] 	Getdizi() {
		return this.dizi;
	}
	public void Setdizi(long a []) {
		this.dizi=a;
		this.dizi_size=a.length;
	}
	
	public int dizi_Lenght() {
		return dizi.length;
	}
	public Scanner veri() {
	  return this.inputt;
	}
	
	public ArrayList<String> GetArrayList() {
		return list;
	}
	
	public void listyazdirma(){
		   for (String i : list) {
			      System.out.println(i);	
	}
	}
}
