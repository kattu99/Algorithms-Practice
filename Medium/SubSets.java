class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> setList = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums, new ArrayList<Integer>(), setList, 0);
        return setList; 
    }
    
    public void subsets(int[] nums, List<Integer> path,List<List<Integer>> setList, int index) {
        setList.add(new ArrayList(path)); //store previous array list
        for (int i=index;i<nums.length;i++) {
            path.add(nums[i]); //keep growing current array list 
            subsets(nums, path, setList,i+1);   
            path.remove(path.size()-1);
        }
    }
    
}


