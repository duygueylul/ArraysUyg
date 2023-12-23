package ArraysUyg;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        int[][] sTablosu = new int[3][2];
        int i, j;

       
        System.out.print("Satış [0,0]=");
        sTablosu[0][0] = scan.nextInt();
        
        System.out.print("Satış [0,1]=");
        sTablosu[0][1] = scan.nextInt();
        
        System.out.print("Satış [1,0]=");
        sTablosu[1][0] = scan.nextInt();
        
        System.out.print("Satış [1,1]=");
        sTablosu[1][1] = scan.nextInt();
        
        System.out.print("Satış [2,0]=");
        sTablosu[2][0] = scan.nextInt();
        
        System.out.print("Satış [2,1]=");
        sTablosu[2][1] = scan.nextInt();

        
        System.out.println("Satış Tablonuz: ");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 1; j++) {
                System.out.print(sTablosu[i][j] + " ");
            }
            System.out.println();
        }

	}

}
