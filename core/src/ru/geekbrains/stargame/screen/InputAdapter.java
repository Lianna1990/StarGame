package ru.geekbrains.stargame.screen;
import ru.geekbrains.stargame.BaseScreen;

import com.badlogic.gdx.Gdx;


public class InputAdapter {
    Gdx.input.setInputProcessor(new InputAdapter(){
        public boolean touchDown(int x,int y,int pointer,int button){

            return true;
        }

        public boolean touchUp(int x,int y,int pointer,int button){

            return true;
        }
    });
    BaseScreen BaseScreen = new BaseScreen();
Gdx.input.setInputProcessor(inputProcessor);
}
}
