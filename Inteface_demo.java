public class Inteface_demo extends Exp implements D{
    public void a(){
     System.out.println("a method");
    }
    public void b(){
        System.out.println("b methhod");
    }

    public void a2(){
        System.out.println("a2 method");
    }
    public void b2(){
        System.out.println("b2 methhod");
    }

    public void a3(){
        System.out.println("a3 method");
    }
    public void b3(){
        System.out.println("b3 methhod");
    }

    public void d(){
        System.out.println("d method");
    }

    void Amethod(A a){
        System.out.println("abc");
    }

    void Bmethod(B b){
        System.out.println("xyz");
    }

    void Cmethod(C c){
        System.out.println("pqr");
    }
    void Dmethod(D d) {
        System.out.println("efg");
    }
    public static void main(String[] args) {
        Inteface_demo obj = new Inteface_demo();
        obj.Amethod(obj);
        obj.Bmethod(obj);
        obj.Cmethod(obj);
        obj.Dmethod(obj);
    }
}
