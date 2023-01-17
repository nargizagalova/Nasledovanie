public class Main {
    public static void main(String[] args) {

        Singer singer = new Singer("Aziza","singing", "Mband");
        System.out.println(singer.getName());
        singer.playGitar();
        singer.singing();


        Dancer dancer = new Dancer("Albert"," dansing" ,"NONstop");
        System.out.println(dancer.getName());
        dancer.dancing();



        Programmer programmer = new Programmer("Aizirek","coding", "Amazon");
        System.out.println(programmer.getName());
        programmer.coding();


    }
}