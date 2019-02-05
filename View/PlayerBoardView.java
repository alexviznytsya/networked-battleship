//
//
// Alex Viznytsya, https://github.com/alexviznytsya
// Michal Bochnak, https://github.com/michalbochnak
//
// Nov 16, 2017
//

//
//  PlayerBoardView class is a class in which we view the player board.
//  We initialize it here.
//



package View;

public class PlayerBoardView extends BoardView {

	private static final long serialVersionUID = 1L;

	// Default constructor:
	public PlayerBoardView() {
		
		this.initialize();
	}


	//
	// Class methods:
	//
	private void initialize() {
		setBounds(340, 30, 500, 500);
	}
}
