import java.util.*;

public class code_day7_med {
    public static void mergeArrays(int a[], int b[]) {
        int n=a.length;
        int m=b.length;
        int i=n-1;int j=0;
        while(i>=0&&j<m){
            if(a[i]>b[j]){
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
            }
            i--;
            j++;
        }  
        Arrays.sort(a);
        Arrays.sort(b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            System.out.println("enter element at"+i+":");
            int x=sc.nextInt();
            a[i]=x;
        }
         for(int i=0;i<m;i++){
            System.out.println("enter element at"+i+":");
            int x=sc.nextInt();
            b[i]=x;
        }
        mergeArrays(a,b); 
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
         for(int i=0;i<m;i++){
            System.out.print(b[i]+" ");
        }
    }
}