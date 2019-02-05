//
// Alex Viznytsya, https://github.com/alexviznytsya
// Michal Bochnak, https://github.com/michalbochnak
//
// Nov 16, 2017
//

import Controller.GameController;

public class BattleshipGame {

    public static void main ( String args[]) {
        GameController battleshipGame = new GameController();
        battleshipGame.startGame(1);
    }
}
