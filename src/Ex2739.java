import java.util.Scanner;

public class Ex2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
     
	        if(N>=1 && 9>=N){
	        for(int j=1; j<=9; j++){
			 System.out.println(N+" * "+j+" = "+ N*j);
			}
		}

	}

}
