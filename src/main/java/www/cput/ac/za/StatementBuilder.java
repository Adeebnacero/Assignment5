package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/04/07.
 */
public  class StatementBuilder {

    public PaymentStatement prerJuniorStatement(){

        PaymentStatement p1 = new PaymentStatement();
        p1.addItem(new JuniorPlayer());

        return p1;
    }
}
