import java.util.Scanner;
public class WaterBillCalculator{
	public static void main(String [] args){
		int meterCharge=75, totalWaterBill, charge=0;
		System.out.println("Enter no of unit consumed: ");
		Scanner sc = new Scanner (System.in);
		int unitConsumed = sc.nextInt();
		if(unitConsumed<=100){
			charge = unitConsumed*5;
			totalWaterBill= charge+ meterCharge;
		}
		else if (unitConsumed<=250){
			charge= unitConsumed*10;
			totalWaterBill= charge+ meterCharge;
		}
		else{
			charge= unitConsumed*20;
			totalWaterBill= charge+ meterCharge;
		}
		System.out.println("The total water bill is: Rs." + totalWaterBill);
	}
}