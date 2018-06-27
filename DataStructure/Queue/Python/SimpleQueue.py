from SimpleList import SimpleList


class SimpleQueue(SimpleList):
    def __init__(self):
        SimpleList.__init__(self)

    def dequeue(self):
        if self.head.next is not self.tail:
            return SimpleList.remove(self, 0)
        return None

    def enqueue(self, obj):
        return SimpleList.add(self, obj)

    def add(self, obj):
        return self.enqueue(obj)

    def remove(self, index):
        return self.dequeue()