public class EngDeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new EngMouse() {
        };
    }

    @Override
    public Keyboard getKeyboard() {
        return new EngKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EngTouchpad();
    }
}
