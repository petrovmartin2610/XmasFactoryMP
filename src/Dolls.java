/**
 * клас част от Factory шаблона, дефиниращ обекта кукли
 */
public class Dolls implements Toys {
    public Dolls(){};

    @Override
    public void toyName() {
        System.out.println("Dolls");
    }
}
