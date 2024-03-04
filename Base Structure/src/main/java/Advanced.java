import java.util.Locale;
import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){

        String answer = sentence.replace( word, newWord);


        return answer;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
char c , d;
int a, b;
       firstName = firstName.toLowerCase(Locale.ROOT);
       lastName = lastName.toLowerCase(Locale.ROOT);
       if((int)firstName.charAt(0)>= 97 || (int)firstName.charAt(0)<= 122){
            a = (int)firstName.charAt(0) - 32;
       }

            c = (char) a;

        if((int)lastName.charAt(0)>= 97 || (int)lastName.charAt(0)<= 122)
        {
            b = (int)lastName.charAt(0) - 32;
             d = (char) b;
        }
firstName.replace(firstName.charAt(0), c);
        lastName.replace(lastName.charAt(0), d);


       String answer = firstName +" "+ lastName;

        return answer;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        for (int i=0; i<word.length(); i++)
        {
            if (word.charAt(i) == word.charAt(i+1))
            {
                String wordnew = word.replace(word.charAt(i) , "")
            }
        }
        return null;
    }
}

