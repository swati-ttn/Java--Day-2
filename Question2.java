package day2;

public class Question2 {
    public static void main(String[] args)
    {
        String original = "WELCOME TO TTN";
        int x = 0;
        char result = 0;
        char[] character = original.toCharArray();

        for (int y = 0; y < character.length; y++) {

            for (x = 0; x < character.length; x++) {

                if (character[x] > character[y]) {
                    result = character[y];
                    character[y] = character[x];
                    character[x] = result;
                }

            }

        }

        for (int k = 0; k < character.length; k++) {
            System.out.println(character[k]);
        }

    }
}
