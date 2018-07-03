package dev.dmitrijg.race;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import dev.dmitrijg.race.view.GameScreen;

public class MainTestGameClass extends Game {

	protected Screen gameScreen;
	@Override
	public void create() {
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}
}
