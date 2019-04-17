package ru.geekbrains.stargame.sprite;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.stargame.base.Sprite;
import ru.geekbrains.stargame.math.Rect;
import ru.geekbrains.stargame.screen.GameScreen;

public class ButtonMainShip extends Sprite {

    private Game game;

    public ButtonMainShip(TextureAtlas atlas, Game game) {
        super(atlas.findRegion("btMainShip"));
        this.game = game;
        setHeightProportion(0.10f);
    }

    @Override
    public void resize(Rect worldBounds)
    {
        super.resize(worldBounds);
        setBottom(worldBounds.getBottom() + 0.5f);
        setLeft(worldBounds.getLeft() + 0.5f);
    }



    public ButtonMainShip(TextureRegion region) {
        super(region);




        }
    }


