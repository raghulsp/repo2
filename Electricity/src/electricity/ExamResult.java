package electricity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamResult {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		int eng;
		int kan;
		int hin;
		int math;
		int sci;
		int soc;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks in English Subject: ");
		eng=sc.nextInt();
		System.out.println("Enter marks in Kannada Subject: ");
		kan=sc.nextInt();
		System.out.println("Enter marks in Hindi Subject: ");
		hin=sc.nextInt();
		System.out.println("Enter marks in Maths Subject: ");
		math=sc.nextInt();
		System.out.println("Enter marks in Science Subject: ");
		sci=sc.nextInt();
		System.out.println("Enter marks in Social Studies Subject: ");
		soc=sc.nextInt();
		System.out.println("Eng marks: " +eng);
		System.out.println("Hin marks: " +kan);
		System.out.println("Eng marks: " +hin);
		System.out.println("Eng marks: " +math);
		System.out.println("Eng marks: " +sci);
		System.out.println("Eng marks: " +soc);
		int total = (eng+kan+hin+math+sci+soc);
		list.add(eng);
		list.add(kan);
		list.add(hin);
		list.add(math);
		list.add(sci);
		list.add(soc);
		
		System.out.println("Total Marks: "+total);
		for (int i=0; i<list.size(); i++) {
			if(list.get(i)<35) {
				System.out.println("The Result is FAIL");
			}
			else if(list.get(i)>35 || list.get(i)<60) {
				System.out.println("The Result is PASS");
			}
			else if(list.get(i)>60 || list.get(i)<85) {
				System.out.println("The Result is First Class");
			}
			else if(list.get(i)>85 || list.get(i)<=100) {
				System.out.println("The Result is Distinction");
			}
			else
			{
				System.out.println("Enter valid marks");
			}
			
		}
		
		
		
		
		
		
	}

}
