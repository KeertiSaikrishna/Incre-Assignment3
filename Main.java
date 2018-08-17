public class Main {
    public static void main(String[] args) {
        Rodent[] obj = new Rodent[3];
        obj[0] =new Mouse();
        obj[1] =new hamster();
        obj[2] =new Gerbil();

        obj[0].desc();
        obj[0].mass();
        obj[0].lifespan();

        obj[1].mass();
        obj[1].lifespan();

        obj[2].mass();
        obj[2].lifespan();
    }
}