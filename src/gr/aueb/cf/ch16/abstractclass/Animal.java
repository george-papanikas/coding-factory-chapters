package gr.aueb.cf.ch16.abstractclass;

public abstract class Animal {
    private long id;
    private String name;

    public Animal() {}

    public Animal(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak(); // subclass should override it at any rate

    public void eat() {
        System.out.print(this.getClass().getSimpleName());
    }

    @Override
    public abstract String toString();
}
