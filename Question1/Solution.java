import java.io.*; 
import java.util.*; 
  
class Radix { 
  
    static int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  
    
    static void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
  
       for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 
  
     
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
  
        
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
  
    
    static void sort(int arr[], int n) 
    { 
        int m = getMax(arr, n); 
  
        for (int exp = 1; m/exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
    } 
  
    /*static void print(int arr[], int n) 
    { 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 

        System.out.print("\n");
    } */
  
  
    public static void main (String[] args) 
    { 

        int testcase;
        int N,K;
        int Scores[];
        int i;
        int teamAtPostion=0;
        int count=0;
        Scanner input=new Scanner(System.in);
        testcase=input.nextInt();
            while(testcase>=1){
                N=input.nextInt();
                K=input.nextInt();
                Scores=new int[N];
                for(i=0;i<N;i++){
                    Scores[i]=input.nextInt();
                }
                sort(Scores,N);
                teamAtPostion=Scores[N-K];
               // System.out.println(teamAtPostion+"\n");
               // print(Scores,N);
                for(i=0;i<Scores.length;i++){
                    if(Scores[i]>=teamAtPostion){
                        count++;
                    }
                }
                System.out.print(count+"\n");
                count=0;
                testcase--;
            }	
			
      
    } 
} 
