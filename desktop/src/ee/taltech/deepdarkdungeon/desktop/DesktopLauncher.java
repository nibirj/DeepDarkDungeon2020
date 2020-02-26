package ee.taltech.deepdarkdungeon.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ee.taltech.deepdarkdungeon.DeepDarkDungeonGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = DeepDarkDungeonGame.WIDTH;
		config.height = DeepDarkDungeonGame.HEIGHT;
		config.resizable = false;
		new LwjglApplication(new DeepDarkDungeonGame(), config);
	}
}