public class Dancer extends Person {
    private String groubName;

    public Dancer(String name, String designation, String groubName) {
        super(name, designation);
        this.groubName = groubName;
    }

    public Dancer(String name, String designation) {
        super(name, designation);

    }

    public String getGroubName() {
        return groubName;
    }

    public void setGroubName(String groubName) {
        this.groubName = groubName;
    }

    @Override
    void walk() {
        System.out.println("Dancer is walking");
    }

    @Override
    void eat() {
        System.out.println("Dancer is eating");
    }

    @Override
    void learn() {
        System.out.println("Dancer is learning");
    }
    public void dancing(){
        System.out.println("dancing");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groubName='" + groubName + '\'' +
                '}';
    }
}
