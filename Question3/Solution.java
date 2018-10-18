import java.util.*;
class Snack{
    
    public static void main(String []args){
        long testcase;
        long n;
        long array[];
        long numberOfDays;
        Scanner input=new Scanner(System.in);
        testcase=input.nextLong();
        while(testcase>=1){
            numberOfDays=0;
            n=input.nextLong();
            array=new long[(int)n];
                for(long i=0;i<n;i++){
                    array[(int)i]=input.nextLong();
            }
            long known=1;
            long totalpeople=n-1;
            long i=0,j=0;
            long sum=0;
            long k=1;
            while(totalpeople>0){
                //System.out.println("TotalPeople Left : "+totalpeople);
                for(i=j;i<k;i++){
                    sum+=array[(int)i];
                }
                j=i;
                //System.out.println("K : "+k+" sum"+sum);
                totalpeople-=sum;
                k+=sum;
                numberOfDays++;
            }
            System.out.println(numberOfDays);
            testcase--;
        }
        
    }
}
