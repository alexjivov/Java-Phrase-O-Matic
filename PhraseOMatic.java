public class PhraseOMatic {
    public static void main(String[] args) {
        // three sets of words to choose from
        String[] wordListOne = {"Big", "Little","Small","Tiny","Gargantuan","Miniscule","Huge","Monstrous"};
        String[] wordListTwo = {"Funny","Sad","Happy","Melancholy","Gregarious","Depressed","Anxious"};
        String[] wordListThree = {"Chicken","Cow","Dog","Cat","Tarantula","Spider Monkey","Orangutan"};
      

        //Find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Create three random numbers to generate the three random words from the lists
        int randOne =  (int) (Math.random() * oneLength);
        int randTwo =  (int) (Math.random() * twoLength);
        int randThree = (int) (Math.random() * threeLength);

        //build the final phrase
        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

        // Print the phrase
        System.out.println("What we need is a " + phrase);
    }
}