"""
You are given a string, you are supposed to remove all occurences
of the target character from the string

Input String: abcadade
Target Character: a
Output String: bcdde
"""

def removeCharacter(word, letter):
  return helper("", word, letter)


def helper(processed, unprocessed, letter):
  if len(unprocessed) == 0:
    return processed
  
  if unprocessed[0] == letter:
    return helper(processed, unprocessed[1:], letter)
  else:
    return helper(processed + unprocessed[0], unprocessed[1:], letter)
    
    
print(removeCharacter("asiodbfoaadaa", "a"))