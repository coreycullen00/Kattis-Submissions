string = str(input())

initials = string[0]

for char in range(len(string)-1):
	if (string[char] == '-'):
		initials+=string[char+1]

print(initials)

