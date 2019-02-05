
//
// Alex Viznytsya, https://github.com/alexviznytsya
// Michal Bochnak, https://github.com/michalbochnak
//
// Nov 16, 2017
//
//
// Coordinates.java
//

//
//  This class initializes the coordinates of row and column, has setter functions
// for it as well as getter functions for it.
//

package Model;

import java.io.Serializable;

public class Coordinates implements Serializable{

    private int row;
    private int col;

    public Coordinates(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }
}
