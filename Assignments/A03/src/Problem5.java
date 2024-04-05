import java.util.ArrayList;

class Problem5 {

    /**
     * TODO.
     * @param s The string to be tokenized.
     * @param d The delimiter character used to split the string into tokens.
     * @return An ArrayList containing all the tokens extracted from the string. If the string does not contain
     * the delimiter, the returned list will contain the original string as a single token. If the string
     * is empty or only contains the delimiter, an empty list is returned.
     */
    static ArrayList<String> tokenize(String s, char d){

        ArrayList<String> result = new ArrayList<>();
        StringBuilder token = new StringBuilder();

        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == d){
                if(!token.isEmpty()){
                    result.add(token.toString());
                    token = new StringBuilder();
                }
            }else{
                token.append(s.charAt(i));
            }
        }

        if (!token.isEmpty()){
            result.add(token.toString());
        }

        return result;
    }
}
