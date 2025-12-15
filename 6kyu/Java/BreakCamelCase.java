//Complete the solution so that the function will break up camel casing,
//using a space between words.
//
//        Example
//"camelCasing"  =>  "camel Casing"
//        "identifier"   =>  "identifier"
//        ""             =>  ""

public class BreakCamelCase {
    public static String camelCase(String input) {
        if(input==null || input.isEmpty()){
            return input;
        }

        StringBuilder result = new StringBuilder();

        for(int i=0; i<input.length();i++){

            char currentInput = input.charAt(i);
            if(Character.isUpperCase(currentInput) && currentInput > 0){
                result.append(" ");
            }
            result.append(currentInput);
        }
        return result.toString();
    }
}

public static void main(String[] args){
    String a = "camelCasing";
    String str = BreakCamelCase.camelCase(a);
    System.out.println(str);
}
