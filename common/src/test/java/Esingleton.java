public class Esingleton {
    private  static  Esingleton instance = new Esingleton();
    private  Esingleton(){};
    public static Esingleton getInstance() {
        return instance;
    }
}
