package com.andrewyankee.smarmiobros;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.andrewyankee.smarmiobros.Screens.PlayScreen;

public class SmarmioBros extends Game {
	//sprite batch is container that holds imgs/textures pre render
	//very memory intensive only have one spritebatch
	public static final int V_WIDTH = 400;
	public static final int V_HEIGHT = 208;
	public SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
		//
		setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
		//delegates render to PlayScreen--whatever screen is active
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
