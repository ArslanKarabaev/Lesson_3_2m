public class Main {
    public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
    bankAccount.deposit(15000);

    while (true){
        try {
            bankAccount.withDraw(6000);
            System.out.println("На вашем счету осталось " + bankAccount.getAmount());
        } catch (LimitException Le) {
            System.out.println(Le.getMessage());
            try {
                bankAccount.withDraw((int)Le.getRemainingAmount());
            } catch (LimitException e) {
                throw new RuntimeException(e);
            }
            break;
        }
    }

    }
}