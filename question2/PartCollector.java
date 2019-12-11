public class PartCollector extends Employee{
    PartCollector(){
        this.authorityLevel = PART_COLLECTOR;
    }

    @Override
    public void write(String message){
        System.out.println(message + "all parts have been gathered");
    }
}
