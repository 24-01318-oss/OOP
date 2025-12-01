public class FakeNewsFilter {

    public static String classify(String text) {
        text = text.toLowerCase();

     
        String[] clickbaitWords = {"shocking", "unbelievable", "you won't believe", "breaking", "jaw-dropping"};
        for (String word : clickbaitWords) {
            if (text.contains(word)) return "clickbait";
        }

        String[] misleadingWords = {"experts claim", "some people say", "rumor", "allegedly", "partially"};
        for (String word : misleadingWords) {
            if (text.contains(word)) return "misleading";
        }


        String[] satireWords = {"humor", "joke", "parody", "sarcasm", "irony"};
        for (String word : satireWords) {
            if (text.contains(word)) return "satire";
        }

   
        return "unknown";
    }
}
