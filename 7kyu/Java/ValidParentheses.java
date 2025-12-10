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

