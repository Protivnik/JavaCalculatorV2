public class WrongInput {
    static void WrongInput(char znak) throws ZnakException {

        if ((znak == '+') || (znak == '-') || (znak == '*') || (znak == '/')) {
        } else {
            throw new ZnakException("ОШИБКА! Неправильный знак действия ");
        }
    }


    static void WrongInput(int a, int b) throws NamberException {

        if (a<1||a>10||b<1||b>10) throw new NamberException("ОШИБКА! Введите целые числа от 1 до 10 включительно");
    }



    static void WrongInput(String[] stroke) throws MassException{

        if ((stroke.length != 3)||(stroke[1].length()!=1)) throw new MassException("ОШИБКА! Введена некорректная информация");
    }
}

class NamberException extends Exception{
    NamberException(String message){

        super(message);
    }
}

class ZnakException extends Exception{
    ZnakException(String message){
        super(message);
    }
}

class MassException extends Exception{
    MassException(String message){

        super(message);

    }
}
