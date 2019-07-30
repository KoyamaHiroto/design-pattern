public class SingletonTest{
    public static void main(String[] args) {
        Renban renban1 = Renban.getInstance();
        Renban renban2 = Renban.getInstance();
        Renban renban3 = Renban.getInstance();
        
        System.out.println(renban1.getNumber());
        System.out.println(renban2.getNumber());
        System.out.println(renban3.getNumber());
    }
}