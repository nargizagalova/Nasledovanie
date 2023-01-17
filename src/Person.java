public abstract class Person {

    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;

    }

    void walk() {
        System.out.println("Person is walking");
    }
    void eat(){
        System.out.println("Person is eating");
    }
    void learn(){
        System.out.println("Person is learning");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
