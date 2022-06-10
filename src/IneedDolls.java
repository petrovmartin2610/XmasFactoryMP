/**
 * клас, част от Command шаблона, предаващ метод за изпълнение към Magic Board
 */
public class IneedDolls implements Command{
    MagicBoard newMagicboard;

    public void printDolls(MagicBoard magicBoard)
    {
        this.newMagicboard = magicBoard;
    }
    public void execute()
    {
        newMagicboard.printDolls();
    }
}
