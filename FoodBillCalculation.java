import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int pz=sc.nextInt();
		int pf=sc.nextInt();
		int dr=sc.nextInt();
		
		int pr= pz*100;
		int pfr=pf*20;
		int drr=dr*10;
		int t=pr+pfr+drr;
		System.out.println(t);
}
}
