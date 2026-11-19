class Solution {
    public String reverseWords(String s) {
    int n=s.length();
    StringBuilder str1=new StringBuilder();
    StringBuilder str2=new StringBuilder();

    for(int i=n-1;i>=0;i--){
       char ch=s.charAt(i);
       if(ch!=' '){
        str1.append(ch);
       }
       else{
        if(str1.length()>0){
        if(str2.length()>0  ){
            str2.append(" ");
        }

        str2.append(str1.reverse());
        str1.setLength(0);
       }
       }
    }
    if(str1.length()>0){
            if(str2.length()>0){
            str2.append(" ");
        }
        str2.append(str1.reverse());
        str1.setLength(0);
    }

    return str2.toString();
    }
}