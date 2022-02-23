
import java.awt.event.ActionEvent;

import javax.tools.DocumentationTool.Location;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {

  public abstract boolean canAddCard(Card c);

	
	private ArrayList <Card> cardPile = new ArrayList <>();

	private int pilex, piley;

	
	public Card draw(){
		return cardPile.remove(cardPile.size()-1);
	}


	public void add(Card c){
		cardPile.add(c);
	}

	
	
	
}
