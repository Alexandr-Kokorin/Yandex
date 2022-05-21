#include <iostream>

struct Node {
    int value;
    Node* left;
    Node* right;
};

Node* New(int value) {
	Node* node = (Node*)malloc(sizeof(Node));
	node->value = value;
	node->left = NULL;
	node->right = NULL;
	return node;
}

Node* Add(Node* node, int value) {
	if (node == NULL) return New(value);
	if (value > node->value) node->right = Add(node->right, value);
	else node->left = Add(node->left, value);
	return node;
}

bool is_binary_search_tree(Node* node) {
    if (node == NULL || (node->left == NULL && node->right == NULL)) return true;
    if (node->left != NULL && node->left->value >= node->value) return false;
    if (node->right != NULL && node->right->value <= node->value) return false;
    return is_binary_search_tree(node->left) && is_binary_search_tree(node->right);
}

int main()
{
    Node* Tree = NULL;
    int array[10] = { 5,1,2,9,8,6,12,3,7,17 };
    for (int i = 0; i < 10; i++)
        Tree = Add(Tree, array[i]);
    printf("%d", is_binary_search_tree(Tree));
}
