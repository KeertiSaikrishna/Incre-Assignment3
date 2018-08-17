import java.util.Scanner;

public class Factory_main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Factory f = new Cyclefactory();
        System.out.println("1:Unicycle 2:Bicycle 3:Tricycle\n enter:");
        int i;
        i=sc.nextInt();

        Cycle c=f.getCycle(i);
        c.print();
    }
}
