package dev.dmitrijg.race.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import dev.dmitrijg.race.MainTestGameClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		System.setProperty("user.name", "user");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MainTestGameClass(), config);
		config.width = 1200;
		config.height = 800;
		config.title = "Car Race!";
		config.addIcon("icon.png", Files.FileType.Local);
	}
}
