class Solution {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        hp(root,"");
        return sum;
    }
    public void hp(TreeNode root,String str){
        if(root==null){
            return;
        }
        str+=root.val;
        if(root.left==null && root.right==null){
            sum+=Integer.parseInt(str);
            return;
        }
        hp(root.left,str);
        hp(root.right,str);
    }
}