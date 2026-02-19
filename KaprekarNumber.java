import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int count=0;
	     int sq=n*n;
	    int temp=n;
	    while(n>0){
	        n=n/10;
	        count++;
	    }
	   
	    int first=sq/(int)Math.pow(10,count);
	     int last=sq%(int)Math.pow(10,count);
	    int sum=first+last;
	    if(temp==sum){
	        System.out.println("Kaprekar");
	    }
	    else{
		System.out.println("Not a Kaprekar");
	}
	}
}
