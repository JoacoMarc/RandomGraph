### RANDOM GRAPH
A binary search tree (BST) implementation is developed where each node has an associated identifier (ID) and a probability.

#### BinarySearchTree Class
- This class implements the `BinaryTreeInterface` and defines the structure and basic operations of a binary search tree, with the attributes `Root`: Root node of the tree, and `Random`: Instance of Random to generate random numbers.

**Constructor:**
- `BinarySearchTree()`: Initializes the tree with a random number generator.

**Methods:**
- `insert(Node node)`: Method of the `BinaryTreeInterface` that inserts a node into the tree. It uses the private `insertRec` method for recursive insertion.
- `insertRec(TreeNode root, Node node)`: Recursive method that inserts a node into the tree based on the probability associated with the node. If the randomly generated probability is less than the node's probability, it is inserted into the left subtree; otherwise, into the right subtree.
- `search(int id)`: Method of the `BinaryTreeInterface` that searches for a node by its ID in the tree. It uses the private `searchRec` method for recursive search.
- `searchRec(TreeNode root, int id)`: Recursive method that searches for a node in the tree. If it finds the node with the specified ID, it returns it; otherwise, it continues searching in the left and right subtrees.
- `inOrder()`: Method of the `BinaryTreeInterface` that returns a list of nodes in the tree in order. It uses the private `inOrderRec` method for the recursive collection of nodes.
- `inOrderRec(TreeNode root, List<Node> nodes)`: Recursive method that performs an in-order traversal of the tree and adds the nodes to the provided list.

#### TreeNode Class
This class implements the `Node` interface and defines the structure of a node in the binary search tree.

**Attributes:**
- `id`: Identifier of the node.
- `probability`: Probability associated with the node.
- `left`: Reference to the left child node.
- `right`: Reference to the right child node.

**Constructor:**
- `TreeNode(int id, double probability)`: Initializes the node with an ID and a probability.

**Methods:**
- `getId()`: Returns the ID of the node.
- `getProbability()`: Returns the probability of the node.
- `setProbability(double probability)`: Sets the probability of the node.
- `getLeft()`: Returns the left child node.
- `setLeft(TreeNode left)`: Sets the left child node.
- `getRight()`: Returns the right child node.
- `setRight(TreeNode right)`: Sets the right child node.

#### Node Interface
Defines the methods that nodes in the tree must implement.

**Methods:**
- `getId()`: Method to get the node's ID.
- `getProbability()`: Method to get the node's probability.
- `setProbability(double probability)`: Method to set the node's probability.

#### BinaryTreeInterface
Defines the methods that the binary search tree must implement.

**Methods:**
- `insert(Node node)`: Method to insert a node into the tree.
- `search(int id)`: Method to search for a node by its ID in the tree.
- `inOrder()`: Method to get a list of nodes in order in the tree.

### Functioning of the Probability-Based Binary Search Tree

1. **Node Insertion**: When inserting a node, a random number is generated and compared to the node's probability. Based on this comparison, the node is inserted into the left or right subtree. This process is repeated recursively until the appropriate position is found.
   
2. **Node Search**: To search for a node, the ID of the node being searched is compared to the IDs of the nodes in the tree, starting from the root and recursively traversing the left and right subtrees.
   
3. **In-Order Traversal**: To get the nodes in order, an in-order traversal of the tree is performed, which first visits the left subtree, then the current node, and finally the right subtree, adding the nodes to a list in the process.

