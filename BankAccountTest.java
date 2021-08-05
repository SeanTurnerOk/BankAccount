public class BankAccountTest{
    public static void main(String[] args){
        BankAccount test = new BankAccount();
        test.changeSavings(15);
        test.changeChecking(15);
        System.out.println(test.getTotal());
    }
}