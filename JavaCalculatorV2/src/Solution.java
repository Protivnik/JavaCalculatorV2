import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String test = reader.readLine();
        String[] stroke = test.toUpperCase().trim().split(" ");

        try {
            WrongInput.WrongInput(stroke);
        }catch (MassException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }



        new Primer().primer(stroke);
    }
}
