    

//**************************************************************************
//GOT THE SOLUTION
//FOR SOLUTION CONTACT ME ON SPARTANVETO@GMAIL.COM
//**************************************************************************




import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.geometry.Orientation;

public class ControlPane extends StackPane
 {
  private int width, height;
  private int paneNum;

  //The constructor creates creates 2 firework control panels
  //with their fireworks with components to control their movement
  public ControlPane(int width, int height)
   {
       this.width = width;
       this.height = height;
       paneNum = 2; //the number of beams panes is 2

       //create 2 panes to control the movement of fireworks
       FireworkControlPane[] fireworkPanes;
       fireworkPanes = new FireworkControlPane[paneNum];
       fireworkPanes[0] = new FireworkControlPane((width/paneNum), height, Color.RED);
       fireworkPanes[1] = new FireworkControlPane((width/paneNum), height, Color.BLUE);


    

//**************************************************************************
//GOT THE SOLUTION
//FOR SOLUTION CONTACT ME ON SPARTANVETO@GMAIL.COM
//**************************************************************************

       GridPane pane1 = new GridPane();
       //add two firework panes into this pane using GridPane
       for (int i = 0; i < paneNum; i++)
            pane1.add(fireworkPanes[i], i, 0);
       
       this.getChildren().add(pane1);
    }
}
