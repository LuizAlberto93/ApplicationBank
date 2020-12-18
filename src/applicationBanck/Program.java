package applicationBanck;

import java.util.Locale;
import java.util.Scanner;
import entitiesBanck.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;

		System.out.println("Entrer account number: ");
		int accountNumber = sc.nextInt();

		System.out.println("Entrer account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();

		System.out.println("is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();

			account = new Account(accountHolder, accountNumber, initialDeposit);
		} else {
			account = new Account(accountHolder, accountNumber);
		}
		System.out.println();
		System.out.println("Account Data\n-------------------------");
		System.out.println(account);

		System.out.println();
		System.out.println("Enter a deposit value: ");
		double initialDeposit = sc.nextDouble();
		account.deposit(initialDeposit);
		System.out.println(account);


		System.out.println();
		System.out.println("Enter a withdraw: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println(account);
		System.out.println();

		sc.close();
	}

}
