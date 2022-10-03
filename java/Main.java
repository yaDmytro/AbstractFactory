public class Main {
    public static void main(String[] args) {

        DeviceFactory factory = getFactoryByCountryCode("UA");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        Touchpad t = factory.getTouchpad();

        m.click();   //це кліентський код він незмінюється
        k.print();
        t.track(10,25);
    }

    private static DeviceFactory getFactoryByCountryCode(String lang){
        String langUpper = lang.toUpperCase();
        switch(langUpper){
            case "UA":
                return new UaDeviceFactory();
            case "ENG":
                return new EngDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Country code:" + lang);
        }
    }
}
