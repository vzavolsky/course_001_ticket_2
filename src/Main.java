public class Main {
    public static void main(String[] args) {
        String palindrom = "loqaqol1";
        int palindormLength = palindrom.length();
        boolean flag = true;
        for (int i = 0; i < palindormLength; i++, palindormLength--) {
            if (palindrom.charAt(i) == palindrom.charAt(palindormLength - 1)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Palindrom.");
        } else {
            System.out.println("Ne pelindorom.");
        }
    }
}
