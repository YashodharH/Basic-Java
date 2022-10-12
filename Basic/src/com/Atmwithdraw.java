public class Atmwithdraw {
    public static void main(String[] args) {
        double acc_bal = 10000;
        double withdraw = 2000;
        do{
            System.out.println(withdraw);
            acc_bal = acc_bal-withdraw;
        }
        while(acc_bal>=2000);
    }
    
}
