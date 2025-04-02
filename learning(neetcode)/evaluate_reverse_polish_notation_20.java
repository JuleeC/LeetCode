class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String c : tokens) {
            if (c.equals("+")) {
                stack.push(stack.pop() + stack.pop());

            } else {
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}