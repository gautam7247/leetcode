class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mp=new HashMap<>();
        Set<Character> mp1=new HashSet<>();

        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(mp.containsKey(ch1)){
                 if(mp.get(ch1)!=ch2 ){
                 return false;
                 }
              
            }
            else{
                if(mp1.contains(ch2)){
                    return false;
                }
            }
            mp.put(ch1,ch2);
            mp1.add(ch2);
        }
        return true;
    }
}