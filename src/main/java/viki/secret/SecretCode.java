package viki.secret;

public class SecretCode {

    public String getInfo(String secret, String guess) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == secret.charAt(i)) {
                a++;
            } else if (secret.indexOf(guess.charAt(i)) > -1) {
                b++;
            }
        }
        return "A" + a + "B" + b;
    }
}
