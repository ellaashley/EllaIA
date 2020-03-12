import java.util.*;
public class Runner {
    public static void main(String[] args){
        Computer c = new Computer(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! What is your name?");
        Human h = new Human(1);
        h.name = sc.nextLine();
        Board board = new Board();

        int moveCount = 0;
        while(true){
            System.out.println(h.name+ ", enter a column:");
            int column = sc.nextInt();
            board.move(h.token, column);
            moveCount++;

            System.out.println("Enter a column:");
            int column2 = sc.nextInt();
            board.move(c.token, column2);

            if(moveCount==42){
                break;
            }
        }

    }
}
