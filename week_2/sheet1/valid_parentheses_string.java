package week_2.sheet1;

public class valid_parentheses_string {
      public boolean checkValidString(String s) {
        int p1=0;
        int p2=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                p1++;
                p2++;
            }else if(ch==')'){
                if(p1>0){
                    p1--;
                }
                p2--;
            }else{
                if(p1>0){  //to keep minimum assume this ')'
                    p1--;
                }
                p2++; //let assume it oopen '('
            }
        if(p2<0) return false; // close ')' are more than open
        }
        return p1==0; // when open and close are equal
    }
}
