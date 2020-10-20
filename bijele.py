theSet = str(input())
aList = theSet.split(' ')
map_object = map(int, aList)
pieces = list(map_object)

if (pieces[0]!=1):
	pieces[0] = 1-pieces[0]
else:
	pieces[0] = 0;

if (pieces[1]!=1):
	pieces[1] = 1-pieces[1]
else:
	pieces[1] = 0;

if (pieces[2]!=2):
	pieces[2] = 2-pieces[2]
else:
	pieces[2] = 0;

if (pieces[3]!=2):
	pieces[3] = 2-pieces[3]
else:
	pieces[3] = 0;

if (pieces[4]!=2):
	pieces[4] = 2-pieces[4]
else:
	pieces[4] = 0;

if (pieces[5]!=8):
	pieces[5] = 8-pieces[5]
else:
	pieces[5] = 0


for i in range(len(pieces)):
	if(i == len(pieces)-1):
		print(pieces[i])
	else:
		print(pieces[i],end=' ')


