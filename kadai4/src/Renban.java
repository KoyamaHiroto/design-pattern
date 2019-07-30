public class Renban{
    private static Renban renban = new Renban();
    private int num;

    public String getNumber(){
        this.num  += 1;
        return String.format(Integer.toString(this.num),04d);
    }

    private Renban(){
        this.num = 0;
    }

    public static Renban getInstance(){
        return renban;
    }
}