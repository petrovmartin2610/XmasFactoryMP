/**
 * клас, реализиращ Singleton шаблона
 */
public class Santa {
    private static final Santa instance = new Santa();
    private Santa() {};

    public static Santa getInstance(){
        return instance;
    }

    public void chooseToy(){
        System.out.println("Choose the number of one of the following orders: ");
        System.out.println("1. I NEED DOLLS! ");
        System.out.println("2. I NEED BICYCLES! ");
    }
}
