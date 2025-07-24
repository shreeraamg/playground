# Merge Two Sorted Array (with extra space)
# https://www.geeksforgeeks.org/dsa/merge-two-sorted-arrays/


def merge_sorted_array(list1, list2):
    i = j = 0
    result = []

    while i < len(list1) and j < len(list2):
        if list1[i] < list2[j]:
            result.append(list1[i])
            i += 1
        else:
            result.append(list2[j])
            j += 1

    if i != len(list1) - 1:
        for k in range(i, len(list1)):
            result.append(list1[k])

    if j != len(list2) - 1:
        for k in range(j, len(list2)):
            result.append(list2[k])

    return result


list1 = [1, 5, 6, 9, 14, 16]
list2 = [2, 4, 5, 7, 9, 12, 13, 14]
print(merge_sorted_array(list1, list2))
