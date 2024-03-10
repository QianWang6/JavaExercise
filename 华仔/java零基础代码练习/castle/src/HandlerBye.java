/**
 * @author Qian Wang
 * @version 1.0
 */
public class HandlerBye extends Handler{
    public HandlerBye(Game game) {
        super(game);
    }
    @Override
    public boolean isBye() {
        return true;
    }
}
