from SimpleList import SimpleList


class SimpleStack(SimpleList):
    def __init__(self):
        SimpleList.__init__(self)

    def pop(self):
        if self.tail.prev is not self.head:
            return SimpleList.remove(self, 0)
        return None

    def push(self, obj):
        return SimpleList.add(self, obj)

    def remove(self, index):
        return self.pop()

    def add(self, obj):
        return self.push(obj)