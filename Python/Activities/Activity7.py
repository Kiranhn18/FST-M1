
numbers = ("3 5 7 8 9 2")
numbers = input("Enter a sequence of comma separated values: ").split(", ")
numbers = input("3 5 7 8 9 2")

sum = 0
for numbers in numbers:
  sum += int (numbers)

print(sum)