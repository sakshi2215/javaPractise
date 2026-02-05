import java.util.Stack;
public class validParenthesis{
    public boolean isValid(String s){
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
            }
            else{
                if(!st.empty()){
                    int topEle = st.peek();  
                st.pop();
                //Note --- We can also use Hasmap for the mappings
                if( (topEle=='(' && ch!=')')  || 
                    ( topEle=='{' && ch!='}' ) || (topEle =='[' && ch!=']')  ){
                        return false;
                    }
                }
                else return false;
                
            }
        }
        if(!st.empty()) return false;
        else return true;
    }
    public static void main(String[] args) {
    
        validParenthesis solution = new validParenthesis();

       
        String test1 = "()";
        String test2 = "([)]";
        String test3 = "{[]}";
      //  String test4 = "([{}])";

        System.out.println("Test 1: " + solution.isValid(test1));
        System.out.println("Test 2: " + solution.isValid(test2));
        System.out.println("Test 3: " + solution.isValid(test3));
    }
}