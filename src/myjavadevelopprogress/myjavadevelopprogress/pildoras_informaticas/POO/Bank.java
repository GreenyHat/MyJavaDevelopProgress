package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;

class Bank {

    private Scanner scKey = new Scanner(System.in);

    public TestingBankAccount createNewAccount() {
        System.out.println("Name of the user: ");
        String user = scKey.next() + scKey.nextLine();// Esto es para saltar a la linea correspondiente y esperar el
                                                      // newLine, ya que de lo contrario un salto de linea se queda
                                                      // almacenado en el buffer y salta directamente al amount

        System.out.println("Initial amount: ");
        double amount = scKey.nextDouble();

        TestingBankAccount newAccount = new TestingBankAccount(amount, user);

        System.out.println("Account created with user: " + user + " and amount: " + amount + "\n");
        return newAccount;
    }

    public void transferMoney(TestingBankAccount fromAccount, TestingBankAccount toAccount, double amount) {
        fromAccount.setExtractMoney(amount);  
        toAccount.setAddMoney(amount);
    }

    public String getAccountInfo(TestingBankAccount account) {
        return account.getAccountInfo();
    }
}
