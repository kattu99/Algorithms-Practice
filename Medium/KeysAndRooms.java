class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] boolArray = new boolean[rooms.size()];
        boolArray[0] = true;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        while (!stack.isEmpty()) {
            int index = stack.pop();
            for (Integer room: rooms.get(index)) {
                if (!boolArray[room]) {
                    boolArray[room] = true;
                    stack.push(room);
                }
            }
        }
        
        for (Boolean bool: boolArray) {
            if (!bool) {
                return false;
            }
        }
        return true; 
    }
    
}