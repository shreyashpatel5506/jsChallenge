import java.util.*;

class BankAccount {
      double Iamount, balnace;

      void setAmount(double Iamount) {
            this.Iamount = Iamount;
            balnace = balnace + Iamount;
      }

      public String getBalance() {
            return "Balance is:-" + this.balnace;
      }

      void Debit(double amount) {
            if (amount > balnace) {
                  System.out.println("Insufficient Balance");
            } else {
                  balnace = balnace - amount;
            }
      }

      void Credit(double amount) {
            balnace = balnace + amount;
      }

}

public class BankAtm {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            double i_amount, debit, credit;
            System.out.println("Enter the Initial Amount:-");
            i_amount = sc.nextInt();
            System.out.println("Enter the Debit Amount:-");
            debit = sc.nextInt();
            System.out.println("Enter the Credit Amount:-");
            credit = sc.nextInt();
            BankAccount b = new BankAccount();
            b.setAmount(i_amount);
            System.out.println(b.getBalance());
            b.Debit(debit);
            System.out.println(b.getBalance());
            b.Credit(credit);
            System.out.println(b.getBalance());

            sc.close();
      }
}