public class UaMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Одинарний клік мишкою");
    }

    @Override
    public void dblclick() {
        System.out.println("Подвійний клік мишкою");

    }

    @Override
    public void scroll(int direction) {

        if(direction >0){
            System.out.println("Перелеснули сторінку вгору");
        }else if(direction < 0){
            System.out.println("Перелеснули сторінку вниз");
        } else{
            System.out.println("Немає зміни позиції мишки");
        }

    }
}
