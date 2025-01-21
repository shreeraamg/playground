def binary_search(nums, target):
  s, e = 0, len(nums)
  while s <= e:
    mid = s + (e - s) // 2
  
    if nums[mid] == target:
      return mid
    elif nums[mid] > target:
      e = mid - 1
    else:
      s = mid + 1
      
  return -1
  
  
nums = [1, 2, 4, 5, 7, 10, 13, 14, 15, 17, 21, 23]
target = 10
print(binary_search(nums, target))