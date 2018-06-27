class MergeSort:
    @staticmethod
    def sort_low_to_high(a):
        temp = [None] * len(a)
        MergeSort.merge_sort_helper1(a, 0, len(a)-1, temp)

    @staticmethod
    def merge_sort_helper1(a, start, to, temp):
        if start < to:
            center = int((start+to)/2)
            MergeSort.merge_sort_helper1(a, start, center, temp)
            MergeSort.merge_sort_helper1(a, center+1, to, temp)
            MergeSort.merge(a, start, center+1, to, temp)

    @staticmethod
    def merge(a, start, middle, to, temp):
        left_end = middle - 1
        k = start
        num = to - start + 1

        while start <= left_end and middle <= to:
            if a[start] <= a[middle]:
                temp[k] = a[start]
                k += 1
                start += 1
            else:
                temp[k] = a[middle]
                k += 1
                middle += 1
        while start <= left_end:
            temp[k] = a[start]
            k += 1
            start += 1
        while middle <= to:
            temp[k] = a[middle]
            k += 1
            middle += 1
        for i in range(0, num):
            a[to] = temp[to]
            to -= 1

test = [7,3,5,2,1]
MergeSort.sort_low_to_high(test)
print(test)