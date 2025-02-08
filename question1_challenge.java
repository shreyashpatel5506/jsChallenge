import java.util.Scanner;

public class question1_challenge {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:-");
            int n = sc.nextInt();

            String[] numArr = String.valueOf(n).split("");
            int mid = numArr.length / 2;
            for (int i = mid + (numArr.length % 2); i < numArr.length; i++) {
                  numArr[i] = "0";
            }
            String result = String.join("", numArr);
            System.out.println("Output:- " + result);
            sc.close();
      }
}