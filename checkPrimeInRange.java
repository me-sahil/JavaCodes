import java.util.Scanner;

public class checkPrimeInRange{

    void checkPrime(int n){
       if(n<=1){
        return;
       }
       int flag=0;
       for(int i=2;i<=n/2;i++){
        if(n%i==0){
            flag=1;
            break;
        }
       }
       if(flag==0){
        System.out.println(n+" is prime");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        checkPrimeInRange checker = new checkPrimeInRange();
        for(int i=x;i<=y;i++){
            checker.checkPrime(i);
        }
    }
}
