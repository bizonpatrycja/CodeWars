# https://www.codewars.com/kata/52a89c2ea8ddc5547a000863

def loop_size(node):
    nodes = []
    while True:
        if node.next in nodes:
            return len(nodes) - nodes.index(node.next)
        if node.next == None:
            return 0
        nodes.append(node.next)
        node = node.next
    
    return 0
