

package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class JavaEdu {

    public static void main(String[] args) {        
        Bank bank = new Bank();
        bank.addAccount("123", "Kamil");
        System.out.println(bank.getItem("123").getAccountName());
        BankApplication.run();
    }
}
