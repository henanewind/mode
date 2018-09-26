package wind.mode;

import wind.mode.template.Game;
import wind.mode.template.impl.Cricket;
import wind.mode.template.impl.Football;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
