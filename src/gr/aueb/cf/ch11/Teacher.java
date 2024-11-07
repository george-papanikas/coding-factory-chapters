package gr.aueb.cf.ch11;

/**
 * This is a {@link Teacher} Java Bean.
 * POJO (Plain Old Java Object)
 */

public class Teacher {
    private long id;
    private String firstname;
    private String lastname;

    public Teacher() {}

    public Teacher(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
