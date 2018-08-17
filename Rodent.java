public abstract class Rodent {
    Rodent(){
        System.out.println("---Rodent class---");
    }

    public void desc(){
        System.out.println("Rodents are small creatures which are generally found in the dark corner places of houses");
    }
    abstract void mass();
    abstract void lifespan();
}