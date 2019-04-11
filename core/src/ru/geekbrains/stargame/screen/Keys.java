package ru.geekbrains.stargame.screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Keys extends BaseScreen {
    private static final int A = 5;
    boolean isAPressed = Gdx.input.isKeyPressed(Keys.A);

    boolean isTouched = Gdx.input.isTouched();
    boolean firstFingerTouching = Gdx.input.isTouched(0);
    boolean secondFingerTouching = Gdx.input.isTouched(1);
    boolean thirdFingerTouching = Gdx.input.isTouched(2);

    int firstX = Gdx.input.getX();
    int firstY = Gdx.input.getY();
    int secondX = Gdx.input.getX(1);
    int secondY = Gdx.input.getY(1);

    boolean justTouched = Gdx.input.justTouched();
    boolean leftPressed = Gdx.input.isButtonPressed(Input.Buttons.LEFT);
    boolean rightPressed = Gdx.input.isButtonPressed(Input.Buttons.RIGHT);
}


