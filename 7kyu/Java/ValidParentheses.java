//
//
//
//Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
// The function should return true if the string is valid, and false if it's invalid.
//
//Examples
//"()"              =>  true
//        ")(()))"          =>  false
//        "("               =>  false
//        "(())((()())())"  =>  true
//Constraints
//0 <= length of input <= 100
//
//All inputs will be strings, consisting only of characters ( and ).
//Empty strings are considered balanced (and therefore valid), and will be tested.
//For languages with mutable strings, the inputs should not be mutated.
//
//Protip: If you are trying to figure out why a string of parentheses is invalid, paste the parentheses into the code editor,
// and let the code highlighting show you!
//



public static boolean validParentheses(String s) {
    int[] balance = {0};
    boolean neverNegative = s.chars()
            .map(c -> c == '(' ? 1 : -1)
            .allMatch(change -> {
                balance[0] += change;
                return balance[0] >= 0;
            });

    return neverNegative && balance[0] == 0;
}

void main() {
    String test1 = "()";
    String test2 = ")(()))";
    String test3 = "(";
    String test4 = "(())((()())())";

    System.out.println(test1 + " -> " + validParentheses(test1));
    System.out.println(test2 + " -> " + validParentheses(test2));
    System.out.println(test3 + " -> " + validParentheses(test3));
    System.out.println(test4 + " -> " + validParentheses(test4));

}

