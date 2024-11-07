package gr.aueb.cf.ch16.abstractclass;

public class Cat extends Animal { // alt+enter -> implements methods

    /*public Cat() {  constructor is not implied as we have an overloaded constructor
        super();
    }*/

    public Cat(long id, String name){
        super(id,name);
    }

    @Override
    public void speak() {
        System.out.println("Hello from cat");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" ate all her food!");
    }

    @Override
    public String toString() {
        return getId() + ", " + getName();
    }
}
