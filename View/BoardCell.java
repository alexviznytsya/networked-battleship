//
// Alex Viznytsya, https://github.com/alexviznytsya
// Michal Bochnak, https://github.com/michalbochnak
//
// Nov 16, 2017
//
//
// BoardCell.java
//

//
//  The BoardCell class is a class in which we have getter and setter methods
// for the board at each individual position, hence the word "BoardCell". It
// also includes opacity which is how much transparency it currently lacks,
// as well as sets the dimension of each cell
//



package View;

import java.awt.Dimension;
import javax.swing.JLabel;
import Model.Coordinates;


public class BoardCell extends JLabel {

	private static final long serialVersionUID = 1L;
    private Coordinates coordinates;
    private double opacity;

    //
	// Default constructor:
	//
	public BoardCell(int row, int col) {
		
		this.coordinates = new Coordinates(row, col);
		this.opacity = 0.0;
		
		this.initialize();
	}

	//
	// Getter methods:
	//
	public  Coordinates getCoordinates() {
        return this.coordinates;
    }

    //
	// Class methods
	//
	private void initialize() {
		setPreferredSize(new Dimension(45, 45));
	}

}
