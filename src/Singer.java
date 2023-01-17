public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer(String name, String designation) {
        super(name, designation);
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    void walk() {
        System.out.println("Singer is walking");
    }

    @Override
    void eat() {
        System.out.println("Singer is eating");
    }

    @Override
    void learn() {
        System.out.println("Singer is learning");
    }
   public void singing() {
       System.out.println("singing");

}
   public void playGitar(){
       System.out.println("playGitar");
   }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}';
    }
}