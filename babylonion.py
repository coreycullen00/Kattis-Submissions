cases = int(input())
while(cases>0):
	babylonian = (str(input()))

	place = (babylonian.split(','))
	#print(place)
	decimal = 0
	count = len(place)-1
	for i in range(len(place)):
		if place[i] =='':
			place[i] = '0'
		decimal+= int(place[i]) * pow(60,count)
		count-=1
	print(decimal)
	cases-=1

 


