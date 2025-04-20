import java.util.Scanner;

public class Tril {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        for(int i = 1; i<=n; i++){
            fact*=i;
        }
        int zero=0;
        while(fact%10==0){
            zero++;
            fact/=10;
        }
        System.out.println(zero);
    }
}
