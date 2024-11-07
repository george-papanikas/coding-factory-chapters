package gr.aueb.cf.ch19.enums;

public enum WeekDay {
    SUNDAY("Sunday"), //SUNDAY operates like a constructor
    MONDAY("Monday"), //We can have more than one parameter
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private final String day; // takes initial value from constructor

    private WeekDay(String day) { //or package-private
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
