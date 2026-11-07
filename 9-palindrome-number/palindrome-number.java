class Solution {
    public boolean isPalindrome(int x) {
        boolean palindrome = false;
        int orgNUm=x;
        int revNUm=0;
        if(x<0){
            return palindrome;
        }
        for(;orgNUm!=0;orgNUm/=10){
            int remainder=orgNUm%10;
            revNUm=revNUm*10+remainder;
        }
        if(revNUm==x){
            palindrome=true;
            return palindrome;
        }else{
        return palindrome;
        }
    }
}