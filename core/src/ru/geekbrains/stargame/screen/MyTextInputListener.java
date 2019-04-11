package ru.geekbrains.stargame.screen;

public class MyTextInputListener implements Input.TextInputListener{
    @Override
    public void input(String text) {
    }

    @Override
    public void canceled() {
    }

    MyTextInputListener listener = new MyTextInputListener();
    Gdx.input.getTextInput(listener,"Dialog Title","Initial Textfield Value");

    int orientation = Gdx.input.getOrientation();
    Orientation nativeOrientation = Gdx.input.getNativeOrientation();

    float accelX = Gdx.input.getAccelerometerX();
    float accelY = Gdx.input.getAccelerometerY();
    float accelZ = Gdx.input.getAccelerometerZ();

    Matrix4 matrix = new Matrix4();

    Gdx.input.getRotationMatrix(matrix.val);

}

}
