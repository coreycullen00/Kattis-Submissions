combination = str(input())
while(combination!='0 0 0 0'):
	#two turns clockwise
	totalDegrees = 1080
	dpt = 9

	aList = combination.split(' ')
	map_object = map(int, aList)
	numbers = list(map_object)

	#stop at first number
	if(numbers[1]>numbers[0]):
		numbers[0]+=40

	totalDegrees+=((numbers[0]-numbers[1])*dpt)

	#turn anticlockwise until next number
	if(numbers[1] > numbers[2]):
		numbers[1]-=40
	totalDegrees+=(numbers[2]-numbers[1])*dpt

	#turn clockwise for third number
	if(numbers[3]>numbers[2]):
		numbers[2]+=40
	totalDegrees+=(numbers[2]-numbers[3])*dpt
	

	
	print(totalDegrees)
	combination = str(input())

