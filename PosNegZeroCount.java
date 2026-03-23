import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(),pos=0,neg=0,zer=0;
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	        arr[i]=sc.nextInt();
	    for(int i=0;i<n;i++){
	        if(arr[i]<0) neg++;
	        else if(arr[i]>0) pos++;
	        else zer++;
	    }
	    System.out.print("Positive count:"+pos+"\nNegative count:"+neg+"\nZero count:"+zer);
	}
}
