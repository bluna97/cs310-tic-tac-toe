package edu.jsu.mcis;

import java.awt.*;
import javax.swing.*;

public class TicTacToeView extends JPanel implements ActionListener {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
		/*
		System.out.println();
		if(model.isXTurn()){
			System.out.println("Player 1 (X) Move:");
			System.out.print("Enter the row and column numbers, separated by a space: ");
		}
		else{
			System.out.println("Player 2 (O) Move:");
			System.out.print("Enter the row and column numbers, separated by a space: ");
		}
*/
    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
		
		//System.out.println("Invalid location. Please try again.");

    }

    public void showResult(String r) {

        /* Display final winner */

        //System.out.println(r + "!");

    }
	
}

/*
public class TicTacToeController {

    private TicTacToeModel model;
    private TicTacToeView view;
    private Scanner keyboard;
  */  
    /* CONSTRUCTOR */

   // public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
        
        /* Initialize model and view */

        //this.model = model;
        //this.view = view;
        
        /* Initialize scanner (for console keyboard) */
        
        //keyboard = new Scanner(System.in);

    //}

    //public void controlModel() {
        
        /* Prompt player for next move using view's showNextMovePrompt() */
        
        //view.showNextMovePrompt();
        
        /* Receive and validate input, which should be read at the keyboard as
           two integers, the row and the column (for example, "1 1" for the
           center square of a 3 x 3 grid).  Make mark if input is valid, or show
           error message using view's showInputError() if input is invalid. */
        
        /* INSERT YOUR CODE HERE */
		
		//int row = keyboard.nextInt();
		//int col = keyboard.nextInt();
		
		//if(!model.makeMark(row, col)){
		//	view.showInputError();
//		}
   // }

//}