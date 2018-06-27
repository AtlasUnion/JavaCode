class SelectionSearch:

    @staticmethod
    def find_highest(a):
        if len(a) == 0:
            return None
        else:
            max_element = 0
            for i in a:
                max_element = i
                for j in a:
                    if max_element < j:
                        max_element = j
        return max_element

    @staticmethod
    def find_lowest(a):
        if len(a) == 0:
            return None
        else:
            min_element = 0
            for i in a:
                min_element = i
                for j in a:
                    if min_element > j:
                        min_element = j
        return min_element


test = [1,2,3,4]
print("Max element is " + str(SelectionSearch.find_highest(test)))
print("Min element is " + str(SelectionSearch.find_lowest(test)))
