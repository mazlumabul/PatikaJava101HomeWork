package hesapMakinesi_Vol2;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		 int select;
	        String menu = "1- Toplama Ýþlemi\n"
	                + "2- Çýkarma Ýþlemi\n"
	                + "3- Çarpma Ýþlemi\n"
	                + "4- Bölme iþlemi\n"
	                + "5- Üslü Sayý Hesaplama\n"
	                + "6- Faktoriyel Hesaplama\n"
	                + "7- Mod Alma\n"
	                + "8- Dikdörtgen Alan ve Çevre Hesabý\n"
	                + "0- Çýkýþ Yap";

	        do {
	            System.out.println(menu);
	            System.out.print("Lütfen bir iþlem seçiniz :");
	            select = scan.nextInt();
	            switch (select) {
	                case 1:
	                    plus();
	                    break;
	                case 2:
	                    minus();
	                    break;
	                case 3:
	                    times();
	                    break;
	                case 4:
	                    divided();
	                    break;
	                case 5:
	                    power();
	                    break;
	                case 6:
	                    factorial();
	                    break;
	                case 7:
	                	mod();
	                	break;
	                case 8:
	                	rectangle();
	                	break;
	                case 0:
	                    break;
	                default:
	                    System.out.println("Yanlýþ bir deðer girdiniz, tekrar deneyiniz.");
	            }
	        } while (select != 0);

	}
	 static void plus() {
	       
	       System.out.print("Kaç adet sayý gireceksiniz..");
	       int counter = scan.nextInt();
	       int number, result=0;
	       
	       for(int i = 1; i<=counter;i++) {
	    	   System.out.print(i + ". sayý :");
	            number = scan.nextInt();
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result += number;
	       }
	       System.out.println("Sonuç : " + result);
	    } 

	    static void minus() {
	     
	        System.out.print("Kaç adet sayý gireceksiniz :");
	        int counter = scan.nextInt();
	        int number, result = 0;

	        for (int i = 1; i <= counter; i++) {
	            System.out.print(i + ". sayý :");
	            number = scan.nextInt();
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result -= number;
	        }

	        System.out.println("Sonuç : " + result);
	    }

	    static void times() {
	      
	    	System.out.print("Kaç adet sayý gireceksiniz :");
	        int counter = scan.nextInt();
	        int number, result = 0;

	        for (int i = 1; i <= counter; i++) {
	            System.out.print(i + ". sayý :");
	            number = scan.nextInt();
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result *= number;
	        }

	        System.out.println("Sonuç : " + result);
	    }

	    static void divided() {
	      
	        System.out.print("Kaç adet sayý gireceksiniz :");
	        int counter = scan.nextInt();
	        double number, result = 0.0;

	        for (int i = 1; i <= counter; i++) {
	            System.out.print(i + ". sayý :");
	            number = scan.nextDouble();
	            
	            if (i != 1 && number == 0) {
	                System.out.println("Böleni 0 giremezsiniz.");
	                continue;
	            }
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result /= number;
	        }

	        System.out.println("Sonuç : " + result);
	    }

	    static void power() {
	       
	        System.out.print("Taban deðeri giriniz :");
	        int base = scan.nextInt();
	        System.out.print("Üs deðeri giriniz :");
	        int exponent = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }

	        System.out.println("Sonuç : " + result);
	    }

	    static void factorial() {
	       
	        System.out.print("Sayý giriniz :");
	        int n = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }

	        System.out.println("Sonuç : " + result);
	    }
	   
	    static void mod() {
	    	
	    		System.out.print("Birinci deðeri giriniz :");
		        int number1 = scan.nextInt();
		        System.out.print("Ýkinci deðeri giriniz :");
		        int number2 = scan.nextInt();
		        
		        if(number2==0) {
		        	System.out.println("Ýkinci deðer sýfýrdan farklý olmalý.");
		        }
		        int result;
		        result = number1 % number2;
		      
		        System.out.println("Sonuç : " + result);
		        
	    }
	    static void rectangle() {
	    	System.out.print("Birinci kenarý giriniz :");
	        int number1 = scan.nextInt();
	        System.out.print("Ýkinci kenarý giriniz :");
	        int number2 = scan.nextInt();
	        
	        if(number1 ==0 || number2 ==0) {
	        	System.out.println("Kenarlar sýfýrdan farklý olmak zorunda");
	        }
	        System.out.println("Çevre : " + (2 * (number1+number2)));
	        System.out.println("Alan : " + (number1*number2));
	    }
}
