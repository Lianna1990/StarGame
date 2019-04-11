package ru.geekbrains.stargame.screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;


public class Dvizhenie {
    boolean leftMove;
    boolean rightMove;

    updateMotion();
    {
        float x = 0;
        if (leftMove) {
            x -= 5 * Gdx.graphics.getDeltaTime();
        }
        if (rightMove) {
            x += 5 * Gdx.graphics.getDeltaTime();
        }
    }

    public void setLeftMove (boolean t);
    {
        if (rightMove && t) rightMove = false;
        leftMove = t;
    }
    public void setRightMove ( boolean t)
    {
        if (leftMove && t) leftMove = false;
        rightMove = t;
    }
}

    private void updateMotion() {

    }
    @Override
    public boolean keyDown(int keycode)
    {
        switch (keycode)
        {
            case Input.Keys.LEFT:
                Dvizhenie.setLeftMove(true);
                break;
            case Input.Keys.RIGHT:
                Dvizhenie.setRightMove(true);
                break;
        }
        return true;
    }

    private static void setRightMove(boolean b) {
    }

    private static void setLeftMove(boolean b) {
    }

    @Override
    public boolean keyUp(int keycode)
    {
        switch (keycode)
        {
            case Input.Keys.LEFT:
                Dvizhenie.setLeftMove(false);
                break;
            case Input.Keys.RIGHT:
                Dvizhenie.setRightMove(false);
                break;
        }
        return true;
    }
}

}
