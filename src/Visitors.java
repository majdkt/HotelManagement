class Visitors {

    private String surname;
    private String name;;
    private Integer companions;
    private Visitors next;

    public Visitors(String surname, String name, Integer companions, Visitors next) {
        this.surname = surname;
        this.name = name;
        this.companions = companions;
        this.next = next;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompanions(Integer companions) {
        this.companions = companions;
    }

    public void setNext(Visitors e) {
        next = e;
    }

    public Visitors getNext() {
        return next;
    }

    public String getName() {
        return name;
    }

    public Integer getCompanions() {
        return companions;
    }

    public String getSurname() {
        return surname;
    }


    public String toString() {
        return
                "Booking confirmation\n"+
                "--------------------------\n"+
                "Surname: " + surname + ", " +"Name: "+ name + ", "
                + "companions number: " + companions;
    }
}