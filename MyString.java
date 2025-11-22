public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        char arr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++){
            if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')){
                arr[i] = (char)(str.charAt(i) + 32);
            
            }else{
                arr[i] = str.charAt(i);
            }
        }
        return new String(arr);
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
       int M = str2.length();
       int N = str1.length();
       if (M == 0) return true;
       if (M > N) return false;
       String lowerStr1 = lowerCase(str1);
       String lowerStr2 = lowerCase(str2);
        for (int i = 0; i <= N - M; i++){
            boolean matched = true;
            for (int j = 0; j < M; j++){
                if (lowerStr1.charAt(i + j) != lowerStr2.charAt(j)){
                    matched = false;
                    break;
                }
       
        }
        if (matched) return true;
    } 
        return false;

    }
}
