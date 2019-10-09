class Perevod {
    String perevod(int z) {
        String rezult= "";
        if (z == 0){
            return "нужно вывести 0,\nно в римских цифрах нуля нету ";
        }
        do {
            if ( z == 100) {
                rezult = "C";
                z -= 100;
            }
            else if ( z >= 90){
                rezult = "XC";
                z -= 90;
            }
            else if ( z >= 50){
                rezult = "L";
                z -= 50;
            }
            else if ( z >= 40){
                rezult = "XL";
                z -= 40;
            }
            else if (z >= 10){
                rezult += "X";
                z -= 10;
            }
            else if (z >= 9){
                rezult += "IX";
                z -= 9;
            }

            else if (z >= 5){
                rezult += "V";
                z -= 5;
            }
            else if (z >= 4){
                rezult += "IV";
                z -= 4;
            }
            else if (z >= 1){
                rezult += "I";
                z --;
            }
        } while (z != 0);
        return rezult;
    }
}
