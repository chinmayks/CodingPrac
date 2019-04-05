package crackingTheCodingInterview.arraysAndStrings;



class ARR_UniqueCharWithoutDS
{
    boolean uniqueCharacters(String str)
    {
        // Assuming string can have characters a-z
        // this has 32 bits set to 0
        int checker = 0;
 
        for (int i=0; i<str.length(); i++)
        {
        	//System.out.println(Integer.toBinaryString(checker));
            int bitAtIndex = str.charAt(i);
            System.out.println(Character.toString((char)97));
            
            
            // if that bit is already set in checker,
            // return false
            //System.out.println(1<<bitAtIndex);
            System.out.println(Integer.toBinaryString(1<<bitAtIndex));
            System.out.println(1<<bitAtIndex);
            if ((checker & (1<<bitAtIndex)) > 0)
                return false;
 
            // otherwise update and continue by
            // setting that bit in the checker
            
            checker = checker | (1<<bitAtIndex);
            System.out.println(Integer.toBinaryString(checker));
        }
 
        // no duplicates encountered, return true
        return true;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        ARR_UniqueCharWithoutDS obj = new ARR_UniqueCharWithoutDS();
        String input = "arys";
 
        if (obj.uniqueCharacters(input))
            System.out.println("The String " + input
                    + " has all unique characters");
        else
            System.out.println("The String " + input
                       + " has duplicate characters");
    }
}