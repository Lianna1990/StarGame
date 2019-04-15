package ru.geekbrains.stargame.base;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.geekbrains.stargame.StarGame;

public class AplicationAdapter extends StarGame {
    private SpriteBatch batch;

    public void create () {
        batch = new SpriteBatch();
    }

    public void render () {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.end();
    }
}

