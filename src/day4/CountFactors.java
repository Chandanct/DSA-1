package day4;

public class CountFactors {
    public static void main(String[] args) {
        System.out.println(countFactor(64));
    }
    public static int countFactor(int number){
        int count = 0;
        for(int i=1;i*i<=number;i++){
            if(number%i==0){
                if(i==number/i)
                    count+=1;
                else
                    count+=2;
            }
        }
        return count;
    }
}
