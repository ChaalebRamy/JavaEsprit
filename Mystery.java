import java.util.Random;
import java.util.Scanner;

public class Mystery {
	
	public static void main(String[] args) {
	    
int niveau;
int n;
int i=10;
int j=15;
char c;
int ascii,asciii;
boolean test=false;
	Scanner sc = new Scanner(System.in);
do {
	

System.out.println("--------Bienvenue au jeu du mystere-----------");
System.out.println("--------Veuillez choisir le niveau-----------");
System.out.println("--------1: Niveau Facile-----------");
System.out.println("--------2: Niveau Moyen-----------");
System.out.println("--------3: Niveau Difficile-----------");
System.out.println("--------0: Quitter-----------");
niveau=sc.nextInt();
}while ((niveau>3)||(niveau<0));
switch(niveau) {
    case 0:

        System.out.println("Vous avez quitté le jeu");
        break;
     
     case 1:
         System.out.println("Niveau Facile : Le mystere est un nombre entre 0 et 100 "
             );
         Random r = new Random();
         int Low = 0;
         int High = 100;
         int R= r.nextInt(High-Low) + Low;
      
         while(j!=0){
         do{
        
        System.out.println("Donner le mistere entre 0 et 100");
        n=sc.nextInt();
        j--;
        }while(n>100||n<0);
         if(n==R)
         {
             System.out.println("Bravo! Vous avez gagner au bout de " +(15-j)+" tentatives");
             
             j=0;
             
         }
         else if(n>R)
         {
         System.out.println("c'est moins, il vous reste " +j+" tentatives");
         
         }
         else if(n<R)
         {
             System.out.println("c'est plus, il vous reste " +j+" tentatives");
            
         }
         
         
         
         }
         break;
     
      case 2:
         
        System.out.println("Niveau Moyen : Le mystere est un nombre entre 0 et 10000");
        
          
           Random r1 = new Random();
         int l1 = 0;
         int h1 = 10000;
         int Res = r1.nextInt(h1-l1) + l1;
        
         while(i!=0){
         do{
        
        System.out.println("Donner le mistere entre 0 et 10000");
        n=sc.nextInt();
        i--;
        }while(n>10000||n<0);
         if(n==Res)
         {
             System.out.println("Bravo! Vous avez gagner au bout de " +(10-i)+" tentatives");
             
             i=0;
             
         }
         else if(n>Res)
         {
         System.out.println("c'est moins, il vous reste " +i+" tentatives");
         
         }
         else if(n<Res)
         {
             System.out.println("c'est plus, il vous reste " +i+" tentatives");
             
         }
         
         
         }
      break;
      case 3:
          
        System.out.println("Niveau Difficile : Le mystere est un nombre entre 10 et 100");
        
         Random random2 = new Random();
         int min = 10;
         int max = 100;
         int R2 = random2.nextInt(max-min) + min;
        Random rand = new Random();
        char c1 =(char)(rand.nextInt(26) + 97);
        asciii = (int) c1;
        
         while(i!=0){
         do{
        
        System.out.println(" Donner le mistere entre 10 et 100");
        n=sc.nextInt();
        i--;
        }while(n>100||n<10);
         
         
          do{
         System.out.println(" Donner le caractere mystere entre a et z");
          c1 = Character.toLowerCase(sc.next().charAt(0));
          ascii = (int) c1;
         }while(ascii<97||ascii>122);
          
          
         
         if((n==R2)&&(ascii==asciii))
         {
             System.out.println("Bravo! Vous avez gagner au bout de " +(10-i)+" tentatives");
             
             i=0;
             
         }
         
         
         
         else if(n>R2)
         {
         System.out.println("c'est moins, ");
         
         if(ascii<asciii)
         {
             System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
         }
         else if(ascii>asciii)
         {
             System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
         }
         else if((n==R2))
         {
             System.out.println("Le nombre est correct, il vous restes " +i+" tentatives");
         } else if((ascii==asciii))
         {
             System.out.println("Le caractere est correct, il vous restes " +i+" tentatives");
         }
         
         
         
         }
         else if(n<R2)
         {
             System.out.println("c'est plus");
            if(ascii<asciii)
         {
             System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
         }
         else if(ascii>asciii)
         {
             System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
         }
        else if((n==R2))
         {
             System.out.println("Le nombre est correct, il vous restes " +i+" tentatives");
         } else if((ascii==asciii))
         {
             System.out.println("Le caractere est correct, il vous restes " +i+" tentatives");
         }
         }
         
         
         
         else if(n==R2){
             System.out.println("Le nombre est correct, il vous restes " +i+" tentatives");
             if(ascii<asciii)
         {
             System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
         }
         else if(ascii>asciii)
         {
             System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
         }else if((ascii==asciii))
             {
             System.out.println("Bravo! Vous avez gagner au bout de " +(10-i)+" tentatives");
         }
         }
         
         
         
         
         
         
        else if(ascii==asciii){
             System.out.println("Le caractere correct, il vous restes " +i+" tentatives");
             if(ascii<asciii)
         {
             System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
         }
         else if(ascii>asciii)
         {
             System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
         }else if((n==R2))
             {
             System.out.println("Bravo!Vous avez gagner au bout de " +(10-i)+" tentatives");
                         }
                         }                         
                         
                         
                         
                                             
                         }
                          
                     break;
                      default: break;
                }

   
 
 
    }

}
