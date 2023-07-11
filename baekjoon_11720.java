import java.util.Scanner;
public class baekjoon_11720{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //입력받은 값을 String형 변수에 저장한 수 char형 변수로 변환
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i<cNum.length; i++){
            sum += cNum[i] - '0'; //아스키코드 -> 숫자 변환
        }
        System.out.print(sum);
    }
}