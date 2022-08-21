import java.util.Scanner;

public class Ex8395 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tot = 0;
		if(n>=1 && n<=10000){
			for(int i=1; i<=n; i++)
				tot += i;   
		}
		System.out.println(tot);
	}
}

