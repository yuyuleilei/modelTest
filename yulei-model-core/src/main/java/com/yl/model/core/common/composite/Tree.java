package com.yl.model.core.common.composite;

import com.alibaba.fastjson.JSON;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/12
 * @description
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
        System.out.println(JSON.toJSONString(tree.root));
    }
}
