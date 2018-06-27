def find(a, val):
    return find_helper(a, val, 0, len(a) - 1)


def find_helper(a, val, start, end):
    index = int((start + end) / 2)
    if a[index] == val:
        return True
    elif start == end:
        return False
    elif a[index] < val:
        return find_helper(a, val, index + 1, end)
    else:
        return find_helper(a, val, start, index - 1)


test_list = [1, 2, 3, 4, 5, 6]
print(str(find(test_list, 4)))
