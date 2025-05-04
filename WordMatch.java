public class WordMatch  
{  
/** The secret string. */  
private String secret;  
/** Constructs a WordMatch object with the given secret string of lowercase letters. */ 

 public WordMatch(String word)  
{  
secret = word;
}  
/** Returns a score for guess, as described in part (a).  
* Precondition: 0 < guess.length() <= secret.length()  
*/  
public int scoreGuess(String guess)  
{ 
    int multiplier = guess.length()*guess.length();
    int count = 0;
    for(int x = 0; x<=secret.length()-guess.length(); x++)
    {
        if(secret.substring(x, x+guess.length()).equals(guess)) count++;
    }

    return multiplier*count;
}  
/** Returns the better of two guesses, as determined by scoreGuess and the rules for a  * tie-breaker that are described in part (b).  
* Precondition: guess1 and guess2 contain all lowercase letters.  
* guess1 is not the same as guess2.  
*/  
public String findBetterGuess(String guess1, String guess2) 
 {
    int a = scoreGuess(guess1);
    int b = scoreGuess(guess2);

    

    if(a>b) return guess1;
    else if(b>a) return guess2;
    else if(guess1.compareTo(guess2)>0) return guess1;
    return guess2;
 }  
}  

