import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		System.out.print("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int i=1; i<=n; i++);
			sum = sum + i;
		System.out.printf("sum from 1 to %d is %d\n", n, sum);
		
	}

}
