package day4;

public class PerfectNumbers {
    public static void main(String[] args) {
        if(IsPerfectNumber(6))
            System.out.println("Perfet Number");
        else
            System.out.println("Not a Perfet Number");
    }

    private static boolean IsPerfectNumber(int n) {
        boolean IsPerfact = false;
        int sum =1;
        for(int i=2;2*i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if (sum==n)
            IsPerfact=true;
        return IsPerfact;
    }
}
