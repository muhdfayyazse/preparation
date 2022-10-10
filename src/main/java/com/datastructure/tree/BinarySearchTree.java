package com.datastructure.tree;

public class BinarySearchTree {
    class Node {
        private int key;
        private Node left, right;

        public Node(int data) {
            this.key = data;
        }
    }

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.key) {
            root.left = insert(root.left, data);
        } else if (data > root.key) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void delete(int key) {
        root = delete_Recursive(root, key);
    }

    private Node delete_Recursive(Node root, int key) {
        if (root == null)
            return root;
        if (key < root.key)
            root.left = delete_Recursive(root.left, key);
        else if (key > root.key)
            root.right = delete_Recursive(root.right, key);
        else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = delete_Recursive(root.right, root.key);
        }
        return root;
    }

    public void traverse() {
        System.out.print("InOrder: ");
        this.inOrder(root);
        System.out.println();
        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();
        System.out.print("PreOrder: ");
        postOrder(root);
        System.out.println();
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.key + ",");
            inOrder(root.right);
        }
    }

    private void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.key + ",");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + ",");
        }
    }

    public boolean search(int data) {
        if (null == this.search(this.root, data)) {
            return false;
        }
        return true;
    }

    private Node search(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (root.key == data) {
            return root;
        } else if (data < root.key) {
            return search(root.left, data);
        } else if (data > root.key) {
            return search(root.right, data);
        }
        return null;
    }

    public int minValue() {
        int minKey = this.root.key;
        Node temp = this.root;
        while (temp.left != null) {
            minKey = temp.left.key;
            temp = temp.left;
        }
        return minKey;
    }

    public int maxValue() {
        int maxKey = this.root.key;
        Node temp = this.root;
        while (temp.right != null) {
            maxKey = temp.right.key;
            temp = temp.right;
        }
        return maxKey;
    }

    public int minValue(Node root) {
        int minKey = root.key;
        Node temp = root;
        while (temp.left != null) {
            minKey = temp.left.key;
            temp = temp.left;
        }
        return minKey;
    }

    public int maxValue(Node root) {
        int maxKey = root.key;
        Node temp = root;
        while (temp.right != null) {
            maxKey = temp.right.key;
            temp = temp.right;
        }
        return maxKey;
    }

    public int depth() {
        return depth(this.root);
    }

    private int depth(Node root) {
        if (root == null) {
            return 0;
        } else {
            /* compute height of each subtree */
            int lheight = depth(root.left);
            int rheight = depth(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(45);
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(11);
        bst.insert(9);
        bst.insert(13);
        bst.insert(15);
        bst.insert(90);
        bst.insert(50);

        bst.delete(12);
        bst.traverse();

        System.out.println("Min Value: " + bst.minValue());
        System.out.println("Max Value: " + bst.maxValue());
        System.out.println("Search: " + bst.search(90));
        System.out.println("depth: " + bst.depth());
    }

}
