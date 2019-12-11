public class Assembler extends Employee{
    Assembler(){
        this.authorityLevel = ASSEMBLER;
    }

    @Override
    public void write(String message){
        System.out.println(message + "all parts have been put together");
    }
}
