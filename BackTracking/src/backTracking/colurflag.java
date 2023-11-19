package backTracking;
import java.util.Scanner;
public class colurflag {
	
	public static long find_Ways(int n)
	{
	
	
	
     if (n == 1 || n == 2) {
        
         return 2;
     }
     long[][] dp = new long[n + 1][5];
     for (int i = 0; i <= n; i++) {
         for (int j = 0; j <= 3; j++) {
             dp[i][j] = 0;
         }
     }

     // red=0, blue after red=1, blue after white=2, white=3
     dp[1][0] = 1; // 1st band can only be red or white
     dp[1][3] = 1;
     for (int i = 2; i < n; i++) {
         dp[i][0] = dp[i - 1][2] + dp[i - 1][3]; // for red
         dp[i][1] = dp[i - 1][0]; // for blue after red
         dp[i][2] = dp[i - 1][3]; // for blue after white
         dp[i][3] = dp[i - 1][0] + dp[i - 1][1]; // for white
     }

     dp[n][0] = dp[n - 1][2] + dp[n - 1][3]; // last band can be red and white only
     dp[n][3] = dp[n - 1][1] + dp[n - 1][0];

    return (dp[n][0] + dp[n][3]);
	}
	    public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);
	         int n = scanner.nextInt();
	       System.out.println(find_Ways(n));
	    }
	}


