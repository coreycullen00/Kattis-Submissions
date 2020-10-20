cases = int(input())

while(cases >0):
	amount = int(input())

	places = []

	for i in range(amount):
		places.append(input())

	placesSet = set(places)

	print(len(placesSet))
	cases=cases-1