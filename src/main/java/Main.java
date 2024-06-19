      // Napisz program, który sprawdza czy dane słowo jest palindromem.

      import java.util.Scanner;

      public class Main {
        public static void main(String[] args) {
          System.out.println("Podaj słowo które chcesz sprawdzic: ");
          Scanner scanner=new Scanner(System.in);
          String slowo = scanner.nextLine();

          int lewa=0;
          int prawa=slowo.length()-1;

          
          while(lewa<prawa)
            {
              if(slowo.charAt(lewa)!=slowo.charAt(prawa))
            {
              System.out.println("Podane słowo nie jest palindromem");
              break;
            
            }

            else 
                  {
                  lewa++;
                  prawa--;
                  
                  }
            
                
            }System.out.println("Podane słowo jest palindromem");
            
              
            
               
            }
          }
            

          

         