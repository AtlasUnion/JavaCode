class InsertionSort:
    @staticmethod
    def sort_low_to_high(a):
        for i in range(1, len(a)):
            tmp = a[i]
            j = None
            for j in range(i, -1, -1):
                if a[j - 1] < tmp:
                    break
                a[j] = a[j - 1]
            a[j] = tmp

    @staticmethod
    def sort_high_to_low(a):
        for i in range(1, len(a)):
            tmp = a[i]
            j = None
            for j in range(i, -1, -1):
                if a[j - 1] > tmp:
                    break
                a[j] = a[j - 1]
            a[j] = tmp


test = [3, 5, 1, 4, 2]
InsertionSort.sort_low_to_high(test)
print(test)
InsertionSort.sort_high_to_low(test)
print(test)
