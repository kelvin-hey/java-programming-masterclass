public class BankAccount {

    private String FirstName;
    private String LastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        FirstName = firstName;
        LastName = lastName;
        this.balance = balance;
    }

    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    // O argumento branch é verdadeiro se o cliente estiver realizando uma operação
    // em um ramo, com um caixa
    // O argumento é falso se o cliente estiver realizando uma operação em um caixa eletrônico
    public double withdraw(double amount, boolean branch) {
        balance -= balance;
        return balance;
    }

    // O argumento branch é verdadeiro se o cliente estiver realizando uma operação
    // em um ramo, com um caixa
    // O argumento é falso se o cliente estiver realizando uma operação em um caixa eletrônico
    public double getBalance() {
        return balance;
    }
}
