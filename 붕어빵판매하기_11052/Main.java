package 붕어빵판매하기_11052;

//혜빈이가 붕어빵이 남아 있는데 남은 붕어빵을 세트로 묶어서 판다고한다
//가장 큰 수익을 남겨야하고 그 최대 수익을 출력하시오

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int iter = scan.nextInt();
        int[] set = new int[iter+1];
        int[] dp = new int[iter+1];
        int max = 0;

//        배열에 값을 각 세트의 가격을 저장한다.
        for(int i=1;i<iter+1;i++){
            set[i] = scan.nextInt();
        }

//        완전탐색법
        dp[1] = set[1];
        for(int j=2;j<iter+1;j++){
            for(int k=1;k<j;k++){
                dp[j] = Math.max(dp[j-k] + dp[k],set[j]);
                if(dp[j] > max){
                    max = dp[j];
                }
            }
            dp[j] = max;
        }

        System.out.println(dp[iter]);




    }
}
