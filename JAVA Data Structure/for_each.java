package dd;
import java.util.Scanner;
public class for_each {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5���� ������ �Է��ϼ���: ");
		int intArray[] = new int[5];
		
		double sum = 0.0;
		for (int i=0; i<intArray.length; i++) 
			intArray[i] = sc.nextInt();
			
		for (int j=0; j<intArray.length; j++) 
			sum+= intArray[j];
			
		System.out.println("����� "+sum/intArray.length);
		sc.close();
			
		}
	}


