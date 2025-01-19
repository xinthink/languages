import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/subsets
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    // 最后一步是回退状态，这实际上是一个 stack，到达叶子节点后，逐层回退
    // 0 0 added:[1]
    // 1 1 added:[1, 2]
    // 2 2 added:[1, 2, 3]
    // 2 2 backtrack: [1, 2, 3]
    // 2 2 removed: [1, 2]
    // 1 1 backtrack: [1, 2]
    // 1 1 removed: [1]
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
