package ca.utoronto.utm.assignment1.q2;
import java.io.*;
import java.util.*;

/**
 * @author csc207student
 * This class allows a console user to play an instance of JugPuzzle.
 * IS-A: inheritance 	(no inheritance is needed for this class).
 * HAS-A: attributes 	(no attributes were make in this class).
 * RESPONDS-TO: methods (getMove and play).
 */
public class JugPuzzleController {
        private static final String INVALID_INPUT_MESSAGE="Invalid number, please enter 0,1 or 2";

        private Scanner scanner;
        private JugPuzzle jugPuzzle;

        /**
         * Constructs a new JugPuzzleController with a new JugPuzzle,
         * ready to play with a user at the console.
         */
        public JugPuzzleController(){
                jugPuzzle=new JugPuzzle();
                scanner=new Scanner(System.in);
        }

        /**
         * 0Ask for and collect the user's input.
         * Return the user's requested moves after verifying that the moves are valid (fall in the range of lower-upper).
         * @param message	The system prints this message in order to inform the user what they should input.
         * @param lower		The lowest value that can be accepted from the user (the lower bound).
         * @param upper		The highest value that can be accepted from the user (the upper bound).
         * @return			The user's requested move
         */
        private int getMove(String message, int lower, int upper){
                int move;
                while(true){
                        try {
                                System.out.print(message);
                                String line=scanner.nextLine();
                                move=Integer.parseInt(line);
                                if(lower<=move && move<=upper){
                                        return move;
                                } else {
                                        System.out.println(INVALID_INPUT_MESSAGE);
                                }
                        }
                        catch(NumberFormatException e){
                                System.out.println(INVALID_INPUT_MESSAGE);
                        }
                }
        }
        /**
         *While the puzzle is not solved keep executing the user's moves from jug (from) to jug (to).
         *Once puzzled is solved print a congratulation message to the user along side the total number of moves made to solve the puzzle.
         */
        public void play(){
                while(!jugPuzzle.isPuzzleSolved()){
                        System.out.println(jugPuzzle); // called the toString() method of jugPuzzle
                        int from, to;
                        from = getMove("spill from jug: ", 0,2);
                        to   = getMove("into jug: ",0,2);
                        jugPuzzle.move(from,to);
                }
                if(jugPuzzle.getMoves()==1) {
                    System.out.println("Congrats you solved it in "+jugPuzzle.getMoves()+" move!!");
                } else {
                	System.out.println("Congrats you solved it in "+jugPuzzle.getMoves()+" moves!!");
                }
        }

        public static void main(String [] args){
                JugPuzzleController jpcc=new JugPuzzleController();
                jpcc.play();
        }
}
