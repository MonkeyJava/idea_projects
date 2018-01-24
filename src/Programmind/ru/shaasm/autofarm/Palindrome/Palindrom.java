package Programmind.ru.shaasm.autofarm.Palindrome;


public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder revst = new StringBuilder(text);
        return text.equalsIgnoreCase(revst.reverse().toString());
    }
}
