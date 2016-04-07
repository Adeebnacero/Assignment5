package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/04/07.
 */
public class PlayerFactory {

        private String name;
        private String surname;
        private int age;
        private int playerClubID;

        public PlayerFactory(){}

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPlayerClubID() {
        return playerClubID;
    }

    public String getSurname() {
        return surname;
    }

    public static class PlayerBuilder {

        private String name;
        private String surname;
        private int age;
        private int playerClubID;
    }

      /*  public PlayerBuilder name(String name) {
            this.name = name;
            return name;
        }

        public PlayerBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public PlayerBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PlayerBuilder playerClubID(int playerClubID) {
            this.playerClubID = playerClubID;
            return this;
        }*/

    //public PlayerFactory build(){

       // return new Player(this);
 //   }

    public PlayerFactory(PlayerBuilder builder) {

        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.playerClubID = builder.playerClubID;
    }

    @Override
    public String toString() {
        return "PlayerFactory{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", playerClubID=" + playerClubID +
                '}';
    }
}


