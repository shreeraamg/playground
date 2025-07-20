arr = [13, 46, 24, 52, 20, 9]
print(arr)

for i in range(0, len(arr) - 1):
    minimum = i
    for j in range(i + 1, len(arr)):
        if arr[j] < arr[minimum]:
            minimum = j
    arr[i], arr[minimum] = arr[minimum], arr[i]

print(arr)
