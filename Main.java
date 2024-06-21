import pack1.Conditions;
import pack1.Trial;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int n=9;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to print");
		str = sc.nextLine();
		sc.close();
		str = str.toUpperCase();
		Trial t = new Trial(n);
		Conditions c = new Conditions(n);
		for(int i=0;i<n;i++) {
			for(int k=0;k<str.length();k++) {
				char ch = str.charAt(k);
				for(int j=0;j<n;j++) {
					if(t.getCondition(ch, i, j)) {
					//if(c.isA(i,j)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
