package ru.geekbrains.stargame.sprite;

import ru.geekbrains.stargame.base.ScaledTouchUpButton;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;


import ru.geekbrains.stargame.math.Rect;
import ru.geekbrains.stargame.screen.GameScreen;


public class ButtonPlay extends ScaledTouchUpButton {

    private Game game;

    public ButtonPlay(TextureAtlas atlas, Game game) {
        super(atlas.findRegion("btPlay"));
        this.game = game;
        setHeightProportion(0.19f);
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setBottom(worldBounds.getBottom() + 0.02f);
        setLeft(worldBounds.getLeft() + 0.02f);
    }

    @Override
    protected void action() {
        game.setScreen(new GameScreen());
    }
}