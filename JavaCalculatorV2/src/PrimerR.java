import java.util.HashMap;
import java.util.Map;

class PrimerR {
    String rimNamber(String... stroke) {
        Map<String, Integer> number = new HashMap<>();
        number.put("I", 1);
        number.put("II", 2);
        number.put("III", 3);
        number.put("IIII", 4);
        number.put("IV", 4);
        number.put("V", 5);
        number.put("VI", 6);
        number.put("VII", 7);
        number.put("VIII", 8);
        number.put("VIIII", 9);
        number.put("IX", 9);
        number.put("X", 10);

        int a = 0;
        int b = 0;
        char znak = stroke[1].charAt(0);


        for (Map.Entry<String, Integer> pair : number.entrySet()) {

            if (stroke[0].equals(pair.getKey())) {
                a = pair.getValue();
            }
            if (stroke[2].equals(pair.getKey())) {
                b = pair.getValue();
            }
        }

        try {
            WrongInput.WrongInput(a, b);
        } catch (NamberException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        int x = new Znak().rezultatDeistviya(a, b, znak);
        return new Perevod().perevod(x);
    }
}
