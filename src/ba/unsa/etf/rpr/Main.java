package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {
     public static int sumaCifara(int x){
         int suma=0;
         while(x!=0){
             suma+=x%10;
             x/=10;
         }
         return suma;

     }
    public static void main(String[] args) {
        System.out.println("Unesi n: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<n;i++){
            if(sumaCifara(i)==i)
                System.out.println(i);
        }
    }
}
