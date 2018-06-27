from SimpleList import SimpleList
from SimpleQueue import SimpleQueue


def test_list():
    print("Testing SimpleList...")
    sl = SimpleList()

    sl.add(10)
    sl.add(25)
    sl.add(100)
    sl.add(50)

    sl.dump()

    print("Getting 2, should be 100, is " + str(sl.get(2)))
    print("Getting 3, should be 50, is " + str(sl.get(3)))
    print("Getting 0, should be 10, is " + str(sl.get(0)))
    print("Getting 1, should be 25, is " + str(sl.get(1)))
    if sl.get(5) is None:
        print("Getting 5, is correctly None")

    print("Removing 1, should be 25, is " + str(sl.remove(1)))
    sl.dump()
    print("Removing 2, should be 50, is " + str(sl.remove(2)))
    sl.dump()

    print("Removing 0, should be 10, is " + str(sl.remove(0)))
    sl.dump()
    print("Removing 0, should be 100, is " + str(sl.remove(0)))
    sl.dump()

    if sl.get(0) is None:
        print("Getting 0, is correctly None")
    if sl.remove(0) is None:
        print("Removing 0, is correctly None")
    print()


def test_queue():
    print("Testing SimpleQueue...")
    sq = SimpleQueue()
    sq.enqueue(10)
    sq.enqueue(25)
    sq.enqueue(100)
    sq.enqueue(50)
    sq.dump()

    print("Dequeueing, should be 10, is " + str(sq.dequeue()))
    sq.dump()


test_list()
test_queue()