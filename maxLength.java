class TreeNode{
    int val;//当前节点的值
    TreeNode left; //左节点
    TreeNode right;//右节点
    TreeNode(int x){
        val=x;//通过构造方法传值
    }
}
public class maxLength{
    public static int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        return  1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        TreeNode t1=new TreeNode(5);
        TreeNode t2=new TreeNode(7);
        t1.left=t2;
        TreeNode t3=new TreeNode(9);
        root.left=t1;
        root.right=t3;
        System.out.println(maxDepth(root));
    }
}
