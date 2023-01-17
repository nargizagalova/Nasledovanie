public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    void walk() {
        System.out.println("Programmer is walking");
    }

    @Override
    void eat() {
        System.out.println("Programmer is walking");
    }

    @Override
    void learn() {
        System.out.println("Programmer is learning");
    }
    public void coding() {
        System.out.println("codind");

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
