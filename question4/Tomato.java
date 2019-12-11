public class Tomato{
    public double val;
    public double surcharge;

    public Tomato(double x){
        val = x;
        surcharge = 0.15;
    }

    public double calculateTotal(){
        return val + surcharge;
    }
}
