package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/04/07.
 */
public class PlayerBuilder {


    public Player prepJunior(){

        Player p1 = new Player();
        p1.addItem(new JuniorPlayer());

        return p1;
    }

    public Player prepSenior(){

        Player p1 = new Player();
        p1.addItem(new SeniorPlayer());

        return p1;
    }
}
