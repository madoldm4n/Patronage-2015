import java.util.Scanner;

//Created by Damian Roma�czuk

public class Zadanie {
    
    public static void main(String[] args) {
     
        Zadanie patronage = new Zadanie();
        patronage.ciagi();
        
        
    }
    public void ciagi(){
        
       
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz sw�j ci�g znak�w : ");
        String ciag = input.nextLine();
        
        int j ;
        int i ;

        i = ciag.length()-1;  
        boolean test = ciag.contains(" ");

       
           if (ciag.length() == 0  || test==true){
                System.err.println("B��d programu.Wprowadzony ci�g jest pusty");
                ciagi();
        }
           else {
                 for (j=i; j>=0;j--){
                 System.out.print(ciag.charAt(j));
           }
            
    }}}