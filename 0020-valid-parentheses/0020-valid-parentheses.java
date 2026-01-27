class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
             char curr=s.charAt(i);
        if(!stack.isEmpty()){
            char last=stack.peek();
           if(ispair(last,curr)){
            stack.pop();
            continue;
           }
        }
        stack.push(curr);

    }
    return stack.isEmpty();
    }
    Boolean ispair(char a,char b){
        return (a=='(' && b==')')||
        (a=='{' && b=='}')||
        (a=='[' && b==']');
    }
}
