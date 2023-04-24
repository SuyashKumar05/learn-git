
    import java.util.*;
    class Node {
        int key;
        Node left;
        Node right;
    
        public Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }
    
    class BinaryTree {
        Node root;
    
        public BinaryTree() {
            root = null;
        }
    
        // Method to insert a new node into the binary tree
        public void insert(int key) {
            root = insertRec(root, key);
        }
    
        private Node insertRec(Node root, int key) {
            if (root == null) {
                root = new Node(key);
                return root;
            }
    
            if (key < root.key) {
                root.left = insertRec(root.left, key);
            } else if (key > root.key) {
                root.right = insertRec(root.right, key);
            }
    
            return root;
        }
    
        // Method for in-order traversal
        public void inorder() {
            inorderRec(root);
        }
    
        private void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.key + " ");
                inorderRec(root.right);
            }
        }
    
        // Method for pre-order traversal
        public void preorder() {
            preorderRec(root);
        }
    
        private void preorderRec(Node root) {
            if (root != null) {
                System.out.print(root.key + " ");
                preorderRec(root.left);
                preorderRec(root.right);
            }
        }
    
        // Method for post-order traversal
        public void postorder() {
            postorderRec(root);
        }
    
        private void postorderRec(Node root) {
            if (root != null) {
                postorderRec(root.left);
                postorderRec(root.right);
                System.out.print(root.key + " ");
            }
        }
    }
    public class MathOperations {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice;
    
            
                System.out.println("\nChoose an operation:\n1. Sets\n2. Permutations and Combinations\n3. Factorial\n4. Tree");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("\nSETS");
                        System.out.println("Enter the size of set A:");
                        int sizeA = sc.nextInt();
                        int[] setA = new int[sizeA];
                        for (int i = 0; i < sizeA; i++) {
                            System.out.println("Enter element " + (i+1) + " of set A:");
                            setA[i] = sc.nextInt();
                        }
                        System.out.println("Enter the size of set B:");
                        int sizeB = sc.nextInt();
                        int[] setB = new int[sizeB];
                        for (int i = 0; i < sizeB; i++) {
                            System.out.println("Enter element " + (i+1) + " of set B:");
                            setB[i] = sc.nextInt();
                        }
                        Set<Integer> set1 = new HashSet<Integer>();
                        Set<Integer> set2 = new HashSet<Integer>();
                        for (int i = 0; i < sizeA; i++) {
                            set1.add(setA[i]);
                        }
                        for (int i = 0; i < sizeB; i++) {
                            set2.add(setB[i]);
                        }
                        System.out.println("Set A: " + set1);
                        System.out.println("Set B: " + set2);
                        Set<Integer> union = new HashSet<Integer>(set1);
                        union.addAll(set2);
                        System.out.println("Union: " + union);
                        Set<Integer> intersection = new HashSet<Integer>(set1);
                        intersection.retainAll(set2);
                        System.out.println("Intersection: " + intersection);
                        Set<Integer> difference = new HashSet<Integer>(set1);
                        difference.removeAll(set2);
                        System.out.println("Difference (A - B): " + difference);
                        break;
                    case 2:
                        System.out.println("\nPERMUTATIONS AND COMBINATIONS");
                        System.out.println("Enter the value of n:");
                        int n = sc.nextInt();
                        System.out.println("Enter the value of r:");
                        int r = sc.nextInt();
                        int nFactorial = 1;
                        int rFactorial = 1;
                        int nMinusRFactorial = 1;
                        for (int i = 1; i <= n; i++) {
                            nFactorial *= i;
                        }
                        for (int i = 1; i <= r; i++) {
                            rFactorial *= i;
                        }
                        for (int i = 1; i <= n-r; i++) {
                            nMinusRFactorial *= i;
                        }
                        int permutations = nFactorial / nMinusRFactorial;
                        int combinations = nFactorial / (rFactorial * nMinusRFactorial);
                        System.out.println("Permutations: " + permutations);
                        System.out.println("Combinations: " + combinations);
                        break;
                    case 3:
                    System.out.println("\nFactorial of the number");
                    Scanner io=new Scanner(System.in);
                    System.out.println("Enter the number: ");
                    int num=io.nextInt();
                    int i=1,fact=1;
                    while(i<=num)
                    {
                        fact=fact*i;
                        i++;
                    }
                    System.out.println("Factorial of the number: "+fact);  
                    
                    case 4:
                        
                    BinaryTree tree = new BinaryTree();

                    // Insert nodes into the binary tree
                    tree.insert(50);
                    tree.insert(30);
                    tree.insert(20);
                    tree.insert(40);
                    tree.insert(70);
                    tree.insert(60);
                    tree.insert(80);
                    System.out.println("Nodes of binary tree:50 30 20 40 70 60 80");
            
                    System.out.println("In-order traversal:");
                    tree.inorder();
                    System.out.println();
            
                    System.out.println("Pre-order traversal:");
                    tree.preorder();
                    System.out.println();
            
                    System.out.println("Post-order traversal:");
                    tree.postorder();
                    System.out.println();
                }
            }
            
                    }
                
            
        