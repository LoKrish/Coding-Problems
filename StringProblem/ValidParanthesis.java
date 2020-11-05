class ValidParanthesis {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        Stack<Character> paranthesis=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                paranthesis.push(s.charAt(i));
                continue;
            }
            if(paranthesis.isEmpty()){
                return false;
            }
            else{
                switch(s.charAt(i)){
                      
                case ')':
                if(paranthesis.peek()=='('){
                    paranthesis.pop();
                }else{
                    return false;
                }
                break;
                
                case '}':
                if(paranthesis.peek()=='{'){
                    paranthesis.pop();
                }else{
                    return false;
                }
                break;
                
                case ']':
                if(paranthesis.peek()=='['){
                    paranthesis.pop();
                }else{
                    return false;
                }
                break;
            }
            }
        }
        return paranthesis.isEmpty();
    }
}
