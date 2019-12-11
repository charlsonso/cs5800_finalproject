public class NetworkService{
    private static volatile NetworkService singleton = null;
    public int val;
    public NetworkService(){
        System.out.println("Initalized");
    }
    public static NetworkService getInstance(){
        if (singleton == null){
            singleton = new NetworkService();
        }

        return singleton;
    }

}
