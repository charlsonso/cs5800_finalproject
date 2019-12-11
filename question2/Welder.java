public class Welder extends Employee{
    Welder(){
        this.authorityLevel = WELDER;
    }

    @Override
    public void write(String message){
        System.out.println(message + "all parts have been welded together");
    }
}
