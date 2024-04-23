


import java.util.Scanner;
public class PrimeNumberRecursive {

            static boolean prime (int n,int i) {
                if (n ==0|| n == 1 ){
                return false;
            }
               if (n == 2){
        return true;
    }
    else
    {
    if (n%i==0) {
        if (i == 1) {
            return prime(n, i + 1);
        } else if (n == 1) {
            return true;

        } else {
            return false;
        }
    }
    else{
            return prime(n, i + 1);
          }
        }
    }

    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                  int n;
                 System.out.print("Sayı Giriniz : ");
                 n=scan.nextInt();

            if (prime(n,1)){
                System.out.println(n+"ASAL SAYIDIR");

            }else {
                System.out.println(n+"ASAL SAYI DEĞİLDİR!");
             }

           }
     }