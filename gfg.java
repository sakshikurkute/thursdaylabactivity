package activity09;

public class gfg 
{
	// Function to check if a word is

    // palindrome

    static boolean checkPalin(String word)

    {

        int n = word.length();

        word = word.toLowerCase();

        for (int i=0; i<n; i++,n--)

           if (word.charAt(i) != word.charAt(n - 1))

              return false;       

        return true;

    }

}
