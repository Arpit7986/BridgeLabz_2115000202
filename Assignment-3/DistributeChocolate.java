import java.util.*;
class DistributeChocolate{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int noofchocolate=sc.nextInt();
		int noofchildren=sc.nextInt();
		int equalChocolate=noofchocolate/noofchildren;
		int remainingChocolate=noofchocolate%noofchildren;
		System.out.println(" The number of chocolates each child gets is"+equalChocolate+" and the number of remaining chocolates are"+remainingChocolate);
	}
}