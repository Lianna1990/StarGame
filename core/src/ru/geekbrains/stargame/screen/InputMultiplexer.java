package ru.geekbrains.stargame.screen;

import com.badlogic.gdx.Gdx;

public class InputMultiplexer {
    InputMultiplexer multiplexer = new InputMultiplexer();
multiplexer.addProcessor(new MyUiInputProcessor());
multiplexer.addProcessor(new MyGameInputProcessor());
Gdx.input.setInputProcessor(multiplexer);
}



