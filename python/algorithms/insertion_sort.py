arr = [13, 46, 24, 52, 20, 9]
n = len(arr)

for i in range(0, n - 1):
    j = i + 1
    while j > 0 and arr[j - 1] > arr[j]:
        arr[j], arr[j - 1] = arr[j - 1], arr[j]
        j = j - 1

print(arr)
