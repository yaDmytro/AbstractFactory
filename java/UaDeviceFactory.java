public class UaDeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new UaMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new UaKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new UaTouchpad();
    }
}
