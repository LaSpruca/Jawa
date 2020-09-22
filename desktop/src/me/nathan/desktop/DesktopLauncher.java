package me.nathan.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import me.nathan.Constants;
import me.nathan.FromWithin;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Pixal";
        config.width = Constants.WIDTH;
        config.height = Constants.HEIGHT;
        new LwjglApplication(new FromWithin(), config);
    }
}
