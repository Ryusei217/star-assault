package com.xssgt.starassault;

import com.badlogic.gdx.Game;
import com.xssgt.starassault.screens.GameScreen;

public class StarAssault extends Game {
	
	public void create () {
		this.setScreen(new GameScreen());
	}
	
	public void render() {
        super.render(); //important!
    }
}
