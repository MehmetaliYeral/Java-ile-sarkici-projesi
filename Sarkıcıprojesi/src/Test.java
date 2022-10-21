
import java.util.Scanner;


public class Test {
    
    private static   Sarkicilar sarkicilar = new Sarkicilar () ;
       
      public static  Scanner scanner = new Scanner(System.in) ;
       
        public static void   islemleri_bastir () {
      
        System.out.println("\t 0 - İslemleri Goruntule") ;
        System.out.println("\t 1 - Sarkıcıları Goruntule") ;
        System.out.println("\t 2 - Sarkıcı Ekle") ;
        System.out.println("\t 3 - Sarkıcı Guncelle") ;
         System.out.println("\t 4 - Sarkıcı sil") ;
          System.out.println("\t 5 - Sarkıcı ara") ;
         System.out.println("\t 6 - Uygulamadan cık...") ;
         
         }  
        public static  void sarkicilari_goruntule () {
            
            sarkicilar.sarkicilari_bastır();
            
            
        }
         public static void sarkici_ekle () {
             
              System.out.println("Eklemek istediginiz sarkıcının ismini yazınız.") ;
              
              String isim = scanner.nextLine() ;
              
              sarkicilar.sarkici_ekle(isim);
         }
         
          public static void sarkici_sil () {
              
              System.out.println("Sİlmek istediginiz sarkıcının pozisyonunu giriniz.(1,2,3,4,5)") ;
              
              int pozisyon = scanner.nextInt() ;
                 scanner.nextLine() ;
                 
                 sarkicilar.sarkici_sil(pozisyon);
               
          }
          
          public static void sarkici_guncelle() {
              
              System.out.println("Guncellemek istediginiz pozisyonu giriniz (1,2,3..)") ;
              
              int pozisyon = scanner.nextInt() ;
               scanner.nextLine() ;
               
               
               String yeni_isim = scanner.nextLine() ;
               
               sarkicilar.sarkici_guncelle(yeni_isim, pozisyon);
            
              
              
          }
          
            public static void sarkici_ara () {
                
                System.out.println("Aramak istediginiz sarkıcının ismini giriniz") ;
                
                String isim = scanner.nextLine() ;
                
               sarkicilar.sarkici_ara(isim);
                
            }
        

     public static void main(String[] args) {
         
          System.out.println("Sarkı Programına Hosgeldiniz..") ;
          
           islemleri_bastir() ;
           
           boolean cıkıs = false ;
           
           int islem ;
           
           while ( !cıkıs )   {
               
               System.out.println("Bir islem seciniz.");
               
               islem = scanner.nextInt() ;
               
               scanner.nextLine () ;
               
               switch (islem) {
                   
                   case 0  : 
                       
                      islemleri_bastir() ;
                      
                        break ;
                    
                   case 1 :
        
                       sarkicilari_goruntule() ;
                       break;
                   
                   case 2 :
                       
                       sarkici_ekle () ;
                       break ;
                       
                   case 3 :
                       
                       sarkici_guncelle() ;
                       break ;
                       
                   case 4 : 
                        
                       sarkici_sil () ;
                       break;
                       
                   case 5 :
                       
                       sarkici_ara () ;
                       break;
                     
                   case 6 :
                        
                        cıkıs = true ;
                        
               }
              
               
               
              
           }
           
           
              
            
              
               
               
               
               
               
               
               
           }
           
           
           
           
     }
    




