class Solution {
    public String simplifyPath(String path) {

        String[] components = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String dir : components) {
            if (dir.isEmpty() || dir.equals(".")) {
                continue;
            }
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        if(result.length()==0) return "/";
        else{
            return result.toString();
        }
    }
}