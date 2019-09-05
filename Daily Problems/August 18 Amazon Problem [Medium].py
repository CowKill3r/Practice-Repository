#Author: Octavian Stoch
#Date: 8/18/19

from anytree import Node, RenderTree

def makeTree():

	node1 = Node("A")
	node2 = Node("B", parent = node1)
	node3 = Node("C", parent = node1)
	node4 = Node("D", parent = node2)
	node5 = Node("E", parent = node2)
	node6 = Node("F", parent = node3)
	node7 = Node("G", parent = node3)

	for pre, fill, node in RenderTree(node1):
		print("%s%s" % (pre, node.name))


if __name__ == "__main__":
    makeTree()