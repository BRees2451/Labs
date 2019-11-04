#pragma once
#include <iostream>


class IntBinaryTree {
public:
	struct TreeNode{
		int value;
		TreeNode* left;
		TreeNode* right;
	};

	TreeNode* root;
	void destroySubTree(TreeNode*);
	void deleteNode(int, TreeNode*&);
	void makeDeletion(TreeNode*&);

	IntBinaryTree() { root = NULL; };
	~IntBinaryTree() { destroySubTree(root); };
	void insertNode(int);
	bool searchNode(int);
	void remove(int);

	void displayInOrder(TreeNode*);
	void displayPreOrder(TreeNode* );
	void displayPostOrder(TreeNode*);

	void showNodeInOrder(void) { displayInOrder(root); };
	void showNodesPreOrder() { displayPreOrder(root); };
	void showNodesPostOrder() { displayPostOrder(root); };
};
