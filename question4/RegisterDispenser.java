import java.util.Iterator;

public class RegisterDispenser implements Iterator{
    Register register;
    int current_idx;
    int tomato_size;

    public RegisterDispenser(Register reg){
        this.register = reg;
        tomato_size = this.register.list.size();
        current_idx = 0;
    }

    @Override
    public boolean hasNext(){
        if (tomato_size <= current_idx){
            return false;
        }
        return true;
    }

    @Override
    public Object next(){
        double total = this.register.list.get(current_idx).calculateTotal();
        current_idx++;
        return total;
    }
}
