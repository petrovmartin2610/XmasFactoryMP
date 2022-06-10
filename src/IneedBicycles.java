/**
 * клас, част от Command шаблона, предаващ метод за изпълнение към Magic Board
 */

public class IneedBicycles implements Command{
    MagicBoard newMagicboard;

    public void printBicycle(MagicBoard magicBoard)
    {
        this.newMagicboard = magicBoard;
    }
    public void execute()
    {
        newMagicboard.printBicycle();
    }
}
