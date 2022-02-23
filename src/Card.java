import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.tools.DocumentationTool.Location;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{    

private int suit;
private int value;
private boolean faceup;
private int x,y;
private Image image;

private static Image[][] cards = new Image[4][13];
  
public static void loadCards(){
  String[] ss = new String[] {"s", "h", "d", "c"};
  String[] vs = new String[] {"1","2","3","4","5","6","7","8","9","10","j","q","k"};
  for (int s=0; s<4; s++){
    for(int v=0; v<13; v++){
      try{
        cards[s][v] = ImageIO.read(new File("images/cards/" + ss[s] + vs[v] + ".png"));
      }
      catch(IOException e){
        e.printStackTrace();
      }
    }
  }
	Collections.shuffle(cards);
}

public Card(int suit, int value){
    this.suit=suit;
    this.value=value;
}

public void setSuit(int suit) {
    this.suit = suit;
}
public void setValue(int value) {
    this.value = value;
}

public int getSuit() {
    return suit;
}
public int getValue() {
    return value;
}


@Override
public void update(ActionEvent a) {
    // TODO Auto-generated method stub
    
}

@Override
public void draw(Graphics g) {
    // TODO Auto-generated method stub
  if(faceup){
    g.drawImage(cards[suit][value],x,y,null);
  }
  else{
    try{
      g.drawImage(ImageIO.read(new File("images/cards/b1fv.png")),x,y,null);
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
}
