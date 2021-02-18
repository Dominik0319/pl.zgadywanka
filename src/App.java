import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int nr = (int)(Math.random() *101);
    int a =1;
    boolean b= (false); 
     
while(a < 10){
     System.out.println("Podaj liczbę: ");
     int odp = scanner.nextInt();
     System.out.println("próba: "+a);
if(odp > nr)
     {
     System.out.println("Liczba jest mniejsza");
     }
else if(odp < nr)
     {
     System.out.println("Liczba jest większa");
     } 
else if(odp ==nr) {
        b = true;
        break;
    } 
    a++;
}
if(b){
     System.out.println("Zgadłeś! Brawo!");
    }
else{
     System.out.println("Spróbuj następnym razem");
    
}
scanner.close();
}
}
