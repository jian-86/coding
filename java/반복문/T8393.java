
/**
 * 합
 * * 문제
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * * 입력
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * * 출력
 * 1부터 n까지 합을 출력한다.
 */
import java.util.*;

interface T8393 {
    static void main(String[] arges) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int len = sc.nextInt();
        for (int i = 1; i <= len; i++) {
            sum += i;
        }
        System.out.println(sum);
        // System.out.println(len++ * len / 2);

    }
}
