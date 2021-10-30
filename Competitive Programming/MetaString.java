/***************************************************************************************************************************************************
Question: 
          Check if One String Swap Can Make Strings Equal - (LEETCODE QUESTION)

Explaination:
          Return true if it is possible to make both strings equal by performing at most
          one string swap on exactly one of the strings. Otherwise, return false.
----------------------------------------------------------------------------------------------------------------------------------------------------
Example 1:
          Input: s1 = "bank", s2 = "kanb"
          Output: true
          Explanation: For example, swap the first character with the last character of s2 to make "bank".
Example 2:
          Input: s1 = "attack", s2 = "defend"
          Output: false
          Explanation: It is impossible to make them equal with one string swap.
Example 3:
          Input: s1 = "kelb", s2 = "kelb"
          Output: true
          Explanation: The two strings are already equal, so no string swap operation is required.
Example 4:
          Input: s1 = "abcd", s2 = "dcba"
          Output: false
****************************************************************************************************************************************************/
class Solution 
{
    public boolean areAlmostEqual(String s1, String s2) 
    {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) 
        {
            if (s1.charAt(i) != s2.charAt(i)) l.add(i);
            
			if (l.size() > 2) 
                return false; 
        }
        return l.size() == 0 || (l.size() == 2
                                 && s1.charAt(l.get(0)) == s2.charAt(l.get(1))
                                 && s1.charAt(l.get(1)) == s2.charAt(l.get(0)));
    
    }
}
