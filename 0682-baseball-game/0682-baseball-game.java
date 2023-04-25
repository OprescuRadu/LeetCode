class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int operation = 0;
        for(int i = 0 ; i < operations.length ; i++){
            switch (operations[i]){
                case "+": 
                    int a = stack.pop();
                    int b = stack.peek();
                    operation = a + b;
                    stack.push(a);
                    stack.push(operation);
                    break;
                case "D":
                    operation = 2 * stack.peek();
                    stack.push(operation);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(operations[i]));
            }        
        }
        Integer result = 0 ;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}