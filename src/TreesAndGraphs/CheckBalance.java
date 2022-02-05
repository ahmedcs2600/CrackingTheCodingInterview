package TreesAndGraphs;

import java.util.*;

public class CheckBalance {
      private static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public static void main(String[] args) {

         int[] nums = new int[2];

        int[] cloneNums = nums.clone();

        List<Integer> list = new ArrayList<>();

        

        Map<Character,Character[]> mappingTable = new HashMap<>();
        mappingTable.put('2', new Character[] {'a', 'b', 'c'});
        mappingTable.put('3', new Character[] {'d', 'e', 'f'});
        mappingTable.put('4', new Character[] {'g', 'h', 'i'});
        mappingTable.put('5', new Character[] {'j', 'k', 'l'});
        mappingTable.put('6', new Character[] {'m', 'n', 'o'});
        mappingTable.put('7', new Character[] {'p', 'q', 'r', 's'});
        mappingTable.put('8', new Character[] {'t', 'u', 'v'});
        mappingTable.put('9', new Character[] {'w', 'x', 'y', 'z'});
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        Result r = getDepth(root);


        return r.result;
    }

    private Result getDepth(TreeNode node) {
        if(node == null) return new Result(true, 0);

        Result l = getDepth(node.left);
        Result r = getDepth(node.right);

        int depth = Math.max(l.depth, r.depth) + 1;

        boolean result = Math.abs(l.depth - r.depth) <= 1 && r.result && l.result;
        return new Result(result,depth);
    }

    static class Result {
        boolean result;
        int depth;

        Result(boolean result, int depth) {
            this.result = result;
            this.depth = depth;
        }
    }
}
