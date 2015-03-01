import java.util.Scanner;
public class water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double waterAmount;
		double payment;
		
		System.out.println("Enter the amount of the water: ");
		waterAmount = sc.nextDouble();
		
		if (waterAmount>32)
		{
			payment=16*5.5+16*8.7+(waterAmount-32)*20;
		}
		else if(waterAmount>16)
		{
			payment=16*5.5+(waterAmount-16)*8.7;
		}
		else
		{
			payment=waterAmount*5.5;
		}
		
		System.out.println("The total payment is: "+ payment);
		
		
		
	}

}
