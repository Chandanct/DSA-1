package day4;

public class CountofPrimes {
    public static void main(String[] args) {

        System.out.println("Total Prime Number :"+countPrimeNumber(100));
    }

    public static int countPrimeNumber(int n){
        int count = 0;
        for(int i=2;i<=n;i++){
            int counter=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    counter+=1;
            }
            if(counter==2)
                count+=1;
        }
        return count;
    }
}
