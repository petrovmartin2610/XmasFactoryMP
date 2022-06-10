/**
 * клас, част от Command шаблона, отпечатващ резултата от направения избор
 */
public class MagicBoard {

    public void printBicycle(){
        String userInput = "BICYCLES";
        ToyFactory.getToys(userInput);
        System.out.println("Bicycle");
    }

    public void printDolls(){
        String userInput = "DOLLS";
        ToyFactory.getToys(userInput);
        System.out.println("Dolls");
    }
}
