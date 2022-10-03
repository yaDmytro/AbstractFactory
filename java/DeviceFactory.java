public interface DeviceFactory { // це наша абстрактна фабрика
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
