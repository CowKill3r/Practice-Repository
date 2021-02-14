# The first game: roll a die repeatedly.
# Stop rolling once you get a five followed by a six.
# Your number of rolls is the amount you pay, in dollars.
#
# The second game: same, except that the stopping condition 
# is a five followed by a five.
#
# Which of the two games should Alice elect to play? 
# Does it even matter? Write a program to simulate the two 
# games and calculate their expected value.

import random, math

def gameone():
	global gameoneprob
	rollFirst		= 0
	rollSecond		= 0
	numrolls		= 0
	while (rollFirst != 5 or rollSecond != 6):
		#print ('First roll is: ', rollFirst, 'Second roll is: ', rollSecond,
		#	'\nrerolling...')
		rollFirst	= random.randint(1, 6)
		rollSecond	= random.randint(1, 6)
		numrolls	= numrolls + 1
	#print ('Congratulations! First roll is: ', rollFirst, 'Second roll is: ',
	# rollSecond)
	gameoneprob = numrolls
	#print (gameoneprob)



def gametwo():
	global gametwoprob
	rollFirst		= 0
	rollSecond		= 0
	numrolls		= 0
	while (rollFirst != 5 or rollSecond != 5):
		#print ('First roll is: ', rollFirst, 'Second roll is: ', rollSecond,
		#	'\nrerolling...')
		rollFirst	= random.randint(1, 6)
		rollSecond	= random.randint(1, 6)
		numrolls	+= 1
	#print ('Congratulations! First roll is: ', rollFirst, 'Second roll is: ',
	# rollSecond)
	gametwoprob = numrolls
	#print (gametwoprob)

# 1,000 game simulation
def simulate():
	onewins = 0
	twowins = 0
	for games in range(1000):
		gameone()
		gametwo()
		if (gameoneprob < gametwoprob):
			#print ('game ONE wins')
			onewins = onewins + 1
			#print(onewins)
		if (gametwoprob < gameoneprob):
			#print ('game TWO wins')
			twowins = twowins + 1
			#print (twowins)
	print ((onewins/1000)*100, '% probability to win with game one\n', 
		(twowins/1000)*100, '% probability to win with game two')

simulate()