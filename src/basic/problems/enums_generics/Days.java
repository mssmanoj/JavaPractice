package basic.problems.enums_generics;

public enum Days {
    MONDAY("weekday"),TUESDAY("weekday"),WEDNESDAY("weekday"), THURSDAY("weekday"), FRIDAY("weekday"),
    SATURDAY("weekend"), SUNDAY("weekend");
    private final String action; //used to map values with the enums

    Days(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
