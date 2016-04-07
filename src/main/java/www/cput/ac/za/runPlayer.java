package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/04/07.
 */
public class runPlayer {

    public static void main (String [] args){

        PlayerBuilder playerBuilder = new PlayerBuilder();
        StatementBuilder statementBuilder = new StatementBuilder();

        Player jr = playerBuilder.prepJunior();
        System.out.println("Junior Player");
        jr.showItems();

        Player sr = playerBuilder.prepSenior();
        System.out.println("Senior Player");
        sr.showItems();

        /*PaymentStatement jnr = statementBuilder.prerJuniorStatement();
        System.out.println("Junior Player");
        jnr.showItems();*/
    }
}
