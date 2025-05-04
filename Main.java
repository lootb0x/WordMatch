public class Main{
    public static void main(String[] args)
    {
        
        WordMatch word = new WordMatch("mississippi");
        WordMatch word1 = new WordMatch("aaaabb");

        System.out.println(word.scoreGuess("i"));
        System.out.println(word.scoreGuess("iss"));
        System.out.println(word.scoreGuess("issipp"));
        System.out.println(word.scoreGuess("mississippi"));

        System.out.println(word1.scoreGuess("a"));
        System.out.println(word1.scoreGuess("aa"));
        System.out.println(word1.scoreGuess("aaa"));
        System.out.println(word1.scoreGuess("aabb"));
        System.out.println(word1.scoreGuess("c"));

        


        WordMatch word2 = new WordMatch("concatenation");
        
        System.out.println(word2.scoreGuess("ten"));
        System.out.println(word2.scoreGuess("nation"));
        System.out.println(word2.findBetterGuess("ten", "nation" ));
        System.out.println(word2.scoreGuess("con"));
        System.out.println(word2.scoreGuess("cat"));
        System.out.println(word2.findBetterGuess("con", "cat" ));
    } 
}