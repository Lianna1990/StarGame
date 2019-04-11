package ru.geekbrains.stargame;


import com.badlogic.gdx.Game;

import ru.geekbrains.stargame.screen.MenuScreen;

public class StarGame extends Game {
//	SpriteBatch batch;
//	Texture img;

	@Override
	public void create () {
		setScreen(new MenuScreen());
	}

//		batch = new SpriteBatch();
//		img = new Texture("gotham.jpg");



//	}


//	@Override
//	public void render () {
//		Gdx.gl.glClearColor( 0.25f, 0.15f, 0,37f, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		batch.begin();
//		batch.draw(img, 100, 100);
//		batch.end();
//	}

//	@Override
//	public void dispose () {
//		batch.dispose();
//		img.dispose();
//	}
}
