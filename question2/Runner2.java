public class Runner2{
    public static void main(String[] args){
        PartCollector pc = new PartCollector();
        Assembler as = new Assembler();
        Welder we = new Welder();
        Painter pt = new Painter();
        pc.setNextEmployee(as);
        as.setNextEmployee(we);
        we.setNextEmployee(pt);

        pc.doWork(4, "Build a car. ");
    }
}
