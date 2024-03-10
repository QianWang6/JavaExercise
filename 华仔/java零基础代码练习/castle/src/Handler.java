/**
 * @author Qian Wang
 * @version 1.0
 */
public class Handler {
    protected Game game;
    public void  doCmd(String word){

    }

    public Handler(Game game) {
        this.game = game;
    }

    public boolean isBye(){return false;}
    public boolean isHelp(){return false;}

}
