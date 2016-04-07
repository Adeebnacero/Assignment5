package www.cput.ac.za;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adeebo on 2016/04/07.
 */
public class PaymentStatement extends PlayerBuilder {

    private List<PlayerInterface> items = new ArrayList<PlayerInterface>();

    public void addItem(PlayerInterface item){
        items.add(item);
    }

    public double getCost() {
        double cost = 0.0f;

        for (PlayerInterface item : items){
            cost += item.subscription();
        }

        return cost;
    }

    public void showItems(){

        for (PlayerInterface item : items){

            System.out.println("Name: \t\t\t\t" + item.name());
            System.out.println("Surname: \t\t\t" + item.surname());
            System.out.println("Level: \t\t\t\t" + item.levelInterface().level());
            System.out.println("Subscription Fee: \tR" + item.subscription());
            //System.out.println("Apparel: \t" + item.apparel());

        }
    }
}
