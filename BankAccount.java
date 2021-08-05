import java.util.Random;
public class BankAccount{
    private int accountNum;
    private int accountTotal;
    private double checkingBalance=0.00;
    private double savingsBalance=0.00;
    public void BankAccount(){
        this.makeAccountNum();
        accountTotal++;
    }
    private void makeAccountNum(){
        Random rand=new Random();
        this.accountNum= rand.nextInt(900001)+99999;
    }
    public double getChecking(){
        return this.checkingBalance;
    }
    public void changeChecking(int amount){
        if(this.checkingBalance+amount>0){
            this.checkingBalance+=amount;
        }
        else{
            System.out.println("Not enough money, buddy!");
        }
    }
    public double getSavings(){
        return this.savingsBalance;
    }
    public void changeSavings(int amount){
        if(this.savingsBalance+amount>0){
            this.savingsBalance+=amount;
        }
        else{
            System.out.println("Not enough money, buddy!");
        }
    }
    public double getTotal(){
        return this.savingsBalance+this.checkingBalance;
    }
}