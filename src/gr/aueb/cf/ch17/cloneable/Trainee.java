package gr.aueb.cf.ch17.cloneable;

import java.util.Objects;

public class Trainee implements Cloneable {
    private String name;
    private City city;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Trainee() {}

    public Trainee(String name, City city, int id) {
        this.name = name;
        this.city = city;
        this.id =id;
    }

    public Trainee(Trainee trainee) {
        this.name = trainee.getName();
        this.city = new City(trainee.getCity()); // deep copy
        this.id = trainee.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                ", id=" + id +
                '}';
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        //return (Trainee) super.clone();// 1
        Trainee trainee = (Trainee) super.clone(); //shallow copy due to city 2
        trainee.setCity(new City(this.getCity().getName()));
        return trainee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return Objects.equals(getName(), trainee.getName()) && Objects.equals(getCity(), trainee.getCity());
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + getName().hashCode();
        result = 31 * result + getCity().hashCode();
        return result;
    }
}
