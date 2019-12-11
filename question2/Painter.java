public class Painter extends Employee{
    Painter(){
        this.authorityLevel = PAINTER;
    }

    @Override
    public void write(String message){
        System.out.println(message + "Car Complete");
    }
}
