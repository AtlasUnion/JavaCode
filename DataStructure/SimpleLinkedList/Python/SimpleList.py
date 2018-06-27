from SimpleListNode import SimpleListNode


class SimpleList:
    def __init__(self):
        self.head = SimpleListNode()
        self.tail = SimpleListNode()
        self.head.next = self.tail
        self.tail.prev = self.head

    def add(self, obj):
        new_node = SimpleListNode(obj)
        tail_node = self.tail.prev

        if tail_node is not None:
            tail_node.next = new_node
            new_node.prev = tail_node
            new_node.next = self.tail
            self.tail.prev = new_node
            return 0
        return -1

    def get(self, index):
        current_index = 0
        current_node = self.head.next

        while current_node is not self.tail:
            if current_index == index:
                break
            else:
                current_index += 1
                current_node = current_node.next

        if current_node is not self.tail:
            return current_node.obj
        return None

    def remove(self, index):
        current_index = 0
        current_node = self.head.next

        while current_node is not self.tail:
            if current_index == index:
                break
            else:
                current_index += 1
                current_node = current_node.next
        if current_node is not self.tail:
            current_node.prev.next = current_node.next
            current_node.next.prev = current_node.prev
            current_node.prev = None
            current_node.next = None
            return current_node.obj
        return None

    def dump(self):
        current_node = self.head.next

        while current_node is not self.tail:
            print("The items in the list are " + str(current_node.obj))
            current_node = current_node.next