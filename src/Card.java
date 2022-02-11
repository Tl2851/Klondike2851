import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.tools.DocumentationTool.Location;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{    

private int suite;
private int value;
private boolean faceup;
private Location x,y;


public Card(int suite, int value){
    this.suite=suite;
    this.value=value;
}


public void setSuite(int suite) {
    this.suite = suite;
}
public void setValue(int value) {
    this.value = value;
}

public int getSuite() {
    return suite;
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
    
}
}
