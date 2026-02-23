import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=Integer.MIN_VALUE;
		for(int i=1;i<n;i++){
		    int num=sc.nextInt();
		    if(num>max){
		        max=num;
		    }
		}
		System.out.print(max);
	}
}
