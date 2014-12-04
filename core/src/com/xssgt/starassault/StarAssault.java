package com.xssgt.starassault;

import com.badlogic.gdx.Game;

public class StarAssault extends Game {
	
	public void create () {
		this.setScreen(new GameScreen());
	}
	
	public void render() {
        super.render(); //important!
    }
}
