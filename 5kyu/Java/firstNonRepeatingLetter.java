//
//Write a function named first_non_repeating_letter† that takes a string input, and returns the first character
// that is not repeated anywhere in the string.
//
//For example, if given the input 'stress', the function should return 't', since the letter t
// only occurs once in the string, and occurs first in the string.
//
//As an added challenge, upper- and lowercase letters are considered the same character, but the
// function should return the correct case for the initial letter. For example,
// the input 'sTreSS' should return 'T'.
//
//If a string contains all repeating characters, it should return an empty string ("");
//
//† Note: the function is called firstNonRepeatingLetter for historical reasons, but your function
// should handle any Unicode character.
//
//

public class firstNonRepeatingLetter {

    public static String firstNonRepeatingLetters(String s){

        if (s == null || s.isEmpty()) return "";

        String lower = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (lower.indexOf(lower.charAt(i)) == lower.lastIndexOf(lower.charAt(i))) {
                return String.valueOf(s.charAt(i));
            }
        }

        return "";
    }
}

public static void main(String[] args) {

    String a = "stress";
    String b = "moonmoon";

    String getMethod = firstNonRepeatingLetter.firstNonRepeatingLetters(a);
    System.out.println(getMethod);

}

