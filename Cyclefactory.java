public class Cyclefactory extends Factory{
    Cycle getCycle(int i){
        if(i==1)
            return new Unicycle();
        else if(i==2)
            return new Bicycle();
        else if(i==3)
            return new Tricycle();
        else
            return null;
    }
}