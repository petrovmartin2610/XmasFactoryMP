/**
 * клас, част от Factory шаблона, генериращ необходимите обекти
 */

public class ToyFactory {
    public static Toys getToys(String toyType){
        if(toyType == null){
            return null;
        }
        if(toyType.equalsIgnoreCase("DOLLS")){
            return new Dolls();

        } else if(toyType.equalsIgnoreCase("BICYCLES")){
            return new Bicycles();

        }
        return null;
    }
}
