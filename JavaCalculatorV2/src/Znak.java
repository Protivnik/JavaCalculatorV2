class Znak {
    int rezultatDeistviya(int a, int b, char znak) {

        try {
            WrongInput.WrongInput(znak);
        } catch (ZnakException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        if (znak == '+') return a + b;
        else if (znak == '-') return  a - b;
        else if (znak == '*') return  a * b;
        else return  a / b;

    }
}
