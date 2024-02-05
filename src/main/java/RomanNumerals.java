public class RomanNumerals {
    private static final String[] ROMAN = {"I","IV","V","IX","X"};
    private static final int[] ARABIC = {1,4,5,9,10};
    private int number;
    public RomanNumerals(int number){this.number = number;}

public String getRomanNumeral() {
        String res = "";
        int tmp = number;
        for(int i = ARABIC.length-1; i >= 0;i--){
           while(tmp >= ARABIC[i]){
               tmp -= ARABIC[i];
               res += ROMAN[i];
           }
        }
        return res;
    }
}
