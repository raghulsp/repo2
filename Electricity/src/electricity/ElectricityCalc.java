package electricity;

import java.util.Scanner;

public class ElectricityCalc {

	public static void main(String[] args) {

		System.out.println("Enter the number of units used");
		Scanner sc = new Scanner(System.in);
		int total_units=sc.nextInt();
		System.out.println("Enter if any previous arears present: ");
		int arrears = sc.nextInt();
		int fine = (arrears*10)/100;
		double total_bill;
		
				if (total_units<=50) {
			total_bill=(int) (total_units*1.20);
			System.out.println(total_bill+fine);
				}
		else if(total_units>50 || total_units<101) {
			total_bill=(50*1.20)+((total_units-50)*2.40);
			System.out.println(total_bill+fine);
			}
		else if(total_units>100 || total_units<151) {
			total_bill= (50*1.20)+(50*2.40)+((total_units-100)*3.60);
			System.out.println(total_bill+fine);
			}
		else if(total_units>150) {
			total_bill=(50*1.20)+(50*2.40)+(50*3.60)+((total_units-150)*4.80);
			System.out.println(total_bill+fine);
		}		
		else if (total_units>200) {
			total_bill=(50*1.20)+(50*2.40)+(50*3.60)+((total_units-150)*4.80);
			int discount=(int) ((total_bill*5)/100);
			total_bill=total_bill+fine-discount;
			System.out.println(total_bill);
			}
		
	}

}
