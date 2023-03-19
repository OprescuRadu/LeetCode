class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stiva = new Stack<>();
        int op1;
        int op2;
        int result;
        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*")
               && !tokens[i].equals("/") && !tokens[i].equals("^")) {
                stiva.push(Integer.parseInt(tokens[i]));
            }else {
                if (stiva.size() < 2) {
               // System.out.println("Expresia este gresita");
                return 0;
            }
                op1 = stiva.pop();
                op2 = stiva.pop();
                result = operations(op1,op2,tokens[i]);
                stiva.push(result);
            }
        }

        result = stiva.pop();

        if(!stiva.isEmpty()){
          //  System.out.println("Expresia este gresita");
            return 0;
        }
        return result;
    }
    
    
    public static int operations(int op2, int op1, String token) {
        int result;
        switch (token) {
            case "+":
                result = op1 + op2;
                return result;
            case "-":
                result = op1 - op2;
                return result;
            case "*":
                result = op1 * op2;
                return result;
            case "/":
                result = op1 / op2;
                return result;
            case "^":
                result = (int) Math.pow(op1, op2);
                return result;
        }
        return -1;
    }
}