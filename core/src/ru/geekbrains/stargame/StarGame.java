package ru.geekbrains.stargame;

import com.badlogic.gdx.Game;

import ru.geekbrains.stargame.screen.MenuScreen;
import ru.geekbrains.stargame.sprite.ButtonMainShip;

public class StarGame extends Game {

	private ButtonMainShip buttonMainShip;

	@Override
	public void create() {
		setScreen(new MenuScreen(this, buttonMainShip));
	}

}