/**
  клас изпълняващ програмата
 */
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Santa newSanta = Santa.getInstance();                             //инстанция на дядо коледа
        newSanta.chooseToy();                                             //достъп до метод за избор на команда от класа на дядо коледа
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();                                   //пр-ва за потребителски избор
        MagicBoard newMagicBoard = new MagicBoard();                      //инстанция на magicboard класа
        switch (choice) {                                                 //генериране на играчка според choice
            case 1 -> newMagicBoard.printDolls();
            case 2 -> newMagicBoard.printBicycle();
            default -> System.out.println("Invalid input, please try again");
        }




    }
}
