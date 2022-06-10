/**
 * клас част от Factory шаблона, дефиниращ обекта колелета
 */
public class Bicycles implements Toys{
    public Bicycles(){};

    @Override
    public void toyName() {
        System.out.println("Bicycles");
    }
}
