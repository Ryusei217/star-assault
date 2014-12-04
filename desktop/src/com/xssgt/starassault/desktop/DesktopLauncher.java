package com.xssgt.starassault.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.xssgt.starassault.StarAssault;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
	      config.title = "StarAssault";
	      config.width = 1024;
	      config.height = 576;
	      new LwjglApplication(new StarAssault(), config);
	}
}
