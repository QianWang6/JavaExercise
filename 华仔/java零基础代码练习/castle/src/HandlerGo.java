/**
 * @author Qian Wang
 * @version 1.0
 */
public class HandlerGo extends Handler{
    public HandlerGo(Game game) {
        super(game);
    }
    @Override
    public void doCmd(String word) {
        game.goRoom(word);
    }
}
