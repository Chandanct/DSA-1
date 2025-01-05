package day4;

public class IsPrime {
    public static void main(String[] args) {
        if(primeCheck(71))
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }

    public static boolean primeCheck(int n){
        boolean IsPrinmNumber = false;
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i)
                    count+=1;
                else
                    count+=2;
            }
        }
        if (count==2)
            IsPrinmNumber = true;

        return IsPrinmNumber;
    }
}
