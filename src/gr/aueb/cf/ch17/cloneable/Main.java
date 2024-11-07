package gr.aueb.cf.ch17.cloneable;

public class Main {

    public static void main(String[] args) {
        City athens = new City("Athens");
        try {
            City athensClone = athens.clone();
            athensClone.setName("Paris");

            Trainee alice = new Trainee("Alice", athens,1);
            Trainee bob = alice.clone();
            //bob.setCity(athensClone);// like new City("London") 1
            bob.getCity().setName("London"); //2
            bob.setName("Bob");
            bob.setId(2);

            System.out.println(alice);
            System.out.println(bob);

            /*System.out.println(athens);
            System.out.println(athensClone);*/
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }



    }
}
