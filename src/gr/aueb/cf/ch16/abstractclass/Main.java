package gr.aueb.cf.ch16.abstractclass;

public class Main {

    public static void main(String[] args) {

   Animal cat = new Cat(1,"cat");

    cat.eat();
    System.out.println(cat.toString());
    }
}
