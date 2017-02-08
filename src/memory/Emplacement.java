/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author gilles.wilhelm
 */
public class Emplacement {
    private int x;
    private int y;

    public Emplacement(int x, int y) {
        if(( x >= 0) || (x <= 3))
        {
                 this.x = x;   
        }
        if(( y >= 0) || (y <= 3))
        {
            this.y = y;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
