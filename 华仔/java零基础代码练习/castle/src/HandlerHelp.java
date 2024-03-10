/**
 * @author Qian Wang
 * @version 1.0
 */
public class HandlerHelp extends Handler{
    public HandlerHelp(Game game) {
        super(game);
    }
    @Override
    public boolean isHelp(){
        return true;
    }
}
