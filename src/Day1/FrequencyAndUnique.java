package Day1;

public class FrequencyAndUnique {

    public static void main(String[] args) {

        String str = "aaaacccccccbbbbbdddddvxy";
        String result = "";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i) == ch ){
                    count++; // 1
                }
            }

            if (count == 1){
                unique += ch;
            }

            if (result.contains("" + ch)){
                continue;
            }

            if (count > 1){
                result += ch + "" + count + " ";
            }

        }

        System.out.println(result);
        System.out.println("Unique chars are --> " + unique );

    }
}

/*
Write a program that can count frequency of chars and find unique chars of string

input: "aabbbccccxyz"
Output:
    a2 b3 c4
    Unique chars are: xyz
 */