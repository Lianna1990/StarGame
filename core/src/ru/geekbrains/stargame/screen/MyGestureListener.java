package ru.geekbrains.stargame.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;

public class MyGestureListener implements GestureDetector {
    @Override
    public boolean touchDown(int x, int y, int pointer) {
        return false;
    }

    @Override
    public boolean tap(int x, int y, int count) {
        return false;
    }

    @Override
    public boolean longPress(int x, int y) {
        return false;
    }

    @Override
    public boolean fling(float velocityX, float velocityY) {
        return false;
    }

    @Override
    public boolean pan(int x, int y, int deltaX, int deltaY) {
        return false;
    }

    @Override
    public boolean zoom(float originalDistance, float currentDistance) {
        return false;
    }

    @Override
    public boolean pinch(Vector2 initialFirstPointer, Vector2 initialSecondPointer, Vector2 firstPointer, Vector2 secondPointer) {
        return false;
    }

    Gdx.input.setInputProcessor(new GestureDetector(new MyGestureListener()));
}

