import java.util.ArrayList;

public class Register{
    ArrayList<Tomato> list;

    Register(){
        list = new ArrayList<Tomato>();
    }

    public void add(Tomato x){
        list.add(x);
    }
    public double calculateAverage(){
        double total = 0;
        for (Tomato x : list){
            total += x.val;
        }

        total = total/(list.size()*1.0);

        return total;
    }
}
