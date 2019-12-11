public class Runner4{
    public static void main(String[] args){
        singleton_test();        
        composite_test();
        iterator_test();
    }

    public static void singleton_test(){
        NetworkService x = NetworkService.getInstance();
        NetworkService y = NetworkService.getInstance();

        //if i set the val of x, it should change the val at y.
        x.val = 3;
        System.out.println(y.val);
    }

    public static void composite_test(){
       Register x = new Register();
       x.add(new Tomato(3));
       x.add(new Tomato(5));
       System.out.println(x.calculateAverage());
    }
    
    public static void iterator_test(){
        Register x = new Register();
        x.add(new Tomato(3));
        x.add(new Tomato(4));
        RegisterDispenser rd = new RegisterDispenser(x);

        while (rd.hasNext()){
            System.out.println(rd.next());
        }
    }
}
