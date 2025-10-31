public class Job03 {

    public static void main(String[] args) {

        String str = "I'm sorry Dave I'm afraid I can't do that";
        char[] array = str.toCharArray();

        for (char c : array) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'I' || c == 'y') {
                System.out.print(c);
            }
        }
    }
}

