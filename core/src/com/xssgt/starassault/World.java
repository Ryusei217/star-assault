package com.xssgt.starassault;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class World {

	// Los blockes que forman el mundo
	Array<Block> blocks = new Array<Block>();	
	//Nuestro jugador
	Bob bob;
	
	//Metodos get
	public Array<Block> getBlocks() {
		return blocks;
	}
	
	public Bob getBob() {
		return bob;
	}
	
	public World() {
		// TODO Auto-generated constructor stub
		createDemoWorld();
	}
	
	/**
	 * Genera el mundo a partir de coordenadas fijas.
	 */
	private void createDemoWorld() {
		bob = new Bob(new Vector2(7,2));
		
		for (int i = 0; i < 10; i++) {
			blocks.add(new Block(new Vector2(i, 0)));                       
			blocks.add(new Block(new Vector2(i, 7)));                       
			if (i > 2)
				blocks.add(new Block(new Vector2(i, 1)));
				
		}
	}
}
