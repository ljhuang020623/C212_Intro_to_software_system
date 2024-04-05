public class Problem11 {
    public static boolean isValidIpv4(String ip){
        int start = 0;
        int dotCount = 0;
        for (int i = 0; i < ip.length(); i++){
            if (ip.charAt(i) == '.' || i == ip.length() - 1){
                if (ip.charAt(i) == '.'){
                    dotCount += 1;
                }
                int end = (i == ip.length() - 1) ? i + 1 : i;
                String octet = ip.substring(start, end);
                if(!isValidOctet(octet)){
                    return false;
                }
                start = i + 1;
            }
        }
        return dotCount == 3;
    }
    private static boolean isValidOctet(String octet){
        try {
            int value = Integer.parseInt(octet);
            return value >= 0 && value <= 255 && String.valueOf(value).equals(octet);
        } catch(NumberFormatException e){
            return false;
        }
    }
}
