public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] words = sentence.split(" ");

        String answer = (number > words.length)?(" Number = "+String.valueOf(number)+" is out Of Bound"):words[number - 1];
        return answer;
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
int count = 0;
if ( searchForEven ) {
    for (int i = 0; i < number.length(); i++)
    {
       if ( number.charAt(i) % 2 == 0)
       {
           count++;

       }
    }
}
else
    for (int i = 0; i < number.length(); i++)
    {
        if ( number.charAt(i) % 2 != 0)
        {
            count++;

        }
    }
        return count;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {


        return null;
    }
}
