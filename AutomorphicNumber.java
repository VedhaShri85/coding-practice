import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n;
		int count=0;
		int s=n*n;
	    while(n>0){
	        n/=10;
	        count++;
	    }
	 
	    int last=s % ((int) Math.pow(10,count));
	    if(temp==last){
	        System.out.println("Automorphic Number");
	    } else{
	        System.out.println("Not an Automorphic Number");
	    }
	}
}
