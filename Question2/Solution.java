import java.io.*;
import java.util.*;
class Snack{
private static int array[];
 private static int pos=0;
    public static int primeFactors(int n) 
    { 
        int val=0;
        int temp=n;
        array=new int[200];
        pos=0;
        while (n%2==0) 
        { 
            array[pos]=2;
            pos++;
            n /= 2; 
        } 
  
       
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            while (n%i == 0) 
            { 
                array[pos]=i;
                pos++;
                n /= i; 
            } 
        } 
  
       
        if (n > 2) 
            array[pos]=n;
            pos++;

        
        if(pos==2){
            /*for(int i=0;i<pos;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();*/
            if(array[0]!=array[1]){
                val=1;
            }
            else{
                val=0;
            }
        }
        else{
            val=0;
        }
        return val;
}



    public static void main(String[] args) 
    { 
        int n = 6; 
        int check1=0,check2=0;
        int testcase;
        int number;
        int i,j;
        int flag=0;
        Scanner input=new Scanner(System.in);
        testcase=input.nextInt();    
            while(testcase>=1){
                number=input.nextInt();
                for(i=6;i<=number/2;i++){
                    check1=0;
                    check2=0;
                    j=number-i;
                    check1=primeFactors(i);
                    check2=primeFactors(j);
                    if(check1==1 && check2==1){
                      // System.out.println(i+"  "+j);
                        flag=1;
                        break;
                    }
                }
                if (flag==1){
                    System.out.println("YES");
                }
                else if(flag==0){
                    System.out.println("NO");
                }
                flag=0;
                testcase--;
            }
    } 
}
