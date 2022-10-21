
import java.util.ArrayList;


public class Sarkicilar {
    
    private ArrayList<String> sarkici_listesi = new ArrayList<String>() ;
    
    
     public void sarkicilari_bastır () {
         
         System.out.println("Sarkıcılar listesinde" + sarkici_listesi.size() + "kadar sarkıcı var" ) ;
         
         for ( int i = 0 ; i < sarkici_listesi.size() ; i ++ ) {
             
             System.out.println("Sarkıcı:" + sarkici_listesi.get(i)) ;
         }
              }

         public void sarkici_ekle (String isim) {
             
               sarkici_listesi.add(isim) ;
               
               System.out.println("Sarkıcı listeniz guncellendi..") ;
         }
         
          public void sarkici_guncelle (String yeni_isim,int pozisyon) {
               
               sarkici_listesi.set(pozisyon, yeni_isim) ;
              
               System.out.println("Sarkıcı listeniz guncellenmistir.") ;
          }
          
          public void sarkici_sil (int pozisyon) {
              
              String isim = sarkici_listesi.get(pozisyon) ;
              
             sarkici_listesi.remove(pozisyon) ;
             
             System.out.println(isim + "adlı sarkıcı listeden silinmistir.") ;
             
                     
          }
      
          public void sarkici_ara (String sarkici_ismi) {
              
              int pozisyon = sarkici_listesi.indexOf(sarkici_ismi) ;
              
              if ( pozisyon >= 0) {
                  
                  System.out.println("Aradıgınız sarkıcı bulundu");
                  System.out.println(sarkici_ismi + "adlı sarkıcı" + (pozisyon+1) + "pozisyonunda.") ;
              }
              else {
                  
                  System.out.println("Aradıgınız sarkıcı listede bulunamadı.");
              }
          }
    
}
