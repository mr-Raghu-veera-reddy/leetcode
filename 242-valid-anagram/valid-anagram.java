class Solution {
    public boolean isAnagram(String s, String t) {
        boolean anagram = true;
        if(s.length()!=t.length()){
            anagram = false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2)){
        anagram = true;
        }
        else{
            anagram=false;
        }


        
     return anagram;   
    }
}