public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }
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
    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (String sentence : sentences){
            for (String keyword : keywords){
                if (contains(sentence, keyword)){
                    System.out.println(sentence);
                    break;
                }
            }
            
        }
    }
}
