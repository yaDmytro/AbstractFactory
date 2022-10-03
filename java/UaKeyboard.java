public class UaKeyboard implements Keyboard{
    @Override
    public void print() {
        System.out.println("Друкуємо строчку");
    }

    @Override
    public void println() {
        System.out.println("Друкуємо строчку з переходом на нову строчку");
    }
}
