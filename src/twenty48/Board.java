
package twenty48;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Board {
    public final static int NUM_ROWS = 8;
    public final static int NUM_COLUMNS = 8;      
 //   public static Piece board[][] = new Piece[NUM_COLUMNS][NUM_ROWS];

    public static void Reset() {

        for (int zi = 0;zi<NUM_ROWS;zi++)
        {
            for (int zx = 0;zx<NUM_COLUMNS;zx++)
            {
 //               board[zi][zx] = null;
            }
        }

    }
    
    public static void initalizePieces(){
    }
    
    public static void Draw(Graphics2D g) {
//Calculate the width and height of each board square.
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        
 //draw grid     
        g.setColor(Color.black);
        for (int zi = 1;zi<NUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
            Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
        
        for (int zi = 1;zi<NUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
            Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }
                
        
        
    }
    
}
