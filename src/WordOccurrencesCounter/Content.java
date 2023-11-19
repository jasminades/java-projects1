package WordOccurrencesCounter;

public class Content {
    private String paragraph;

    public Content(String p){
        paragraph=p;
    }

    public int getCount(String word){
        String trimmed = paragraph.trim();
        int counter = 0;
        int wordLength = word.length();
        int trimmedLength = trimmed.length();

        if(trimmedLength<wordLength){
            return 0;
        }

        if(trimmedLength == wordLength && trimmed.substring(0,wordLength).equals(word)){
            return 1;
        }
        if (trimmed.substring(0, wordLength).equals(word)){
            counter++;
        }

        if((trimmed.substring(trimmedLength-wordLength)).equals(word) && trimmed.charAt(trimmedLength-wordLength-1)==' '){
            counter++;
        }

        for(int i=wordLength; i < trimmedLength - wordLength ; i++){
            if((trimmed.substring(i, i+wordLength)).equals(word) && trimmed.charAt(i+wordLength) == ' ' && trimmed.charAt(i-1) == ' '){
                counter++;
            }
        }
        return counter++;
    }
}
