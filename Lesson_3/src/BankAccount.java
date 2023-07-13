public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount = sum;
    }

    public void withDraw(int sum) throws LimitException {
        if(sum > amount){
            throw new LimitException(" У вас недостаточно средств для снятия. Вы можете снять: " + amount, amount );
        } else{
        System.out.println("Вы списали " + sum + " сом");
        amount -= sum;}
    }
}
