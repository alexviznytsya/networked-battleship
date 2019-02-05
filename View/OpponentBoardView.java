//
// Alex Viznytsya, https://github.com/alexviznytsya
// Michal Bochnak, https://github.com/michalbochnak
//
// Nov 16, 2017
//

//
//  OpponentBoardView class is a class in which we view the opponents board.
//  we initialize it here
//



package View;

public class OpponentBoardView extends BoardView {
	
	// Default constructor:
	
	private static final long serialVersionUID = 1L;

	public OpponentBoardView() {
		
		this.initialize();
	}
	
	// Getter methods:
		
	// Setter methods:
			
	// Class methods:
	
	private void initialize() {
		setBounds(890, 30, 500, 500);
	}

}
