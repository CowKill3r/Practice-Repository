#Given a number N, find out minimum number of numbers needed whose last digit is 
#9 to make sum N. Output -1 if not possible.

#Examples:
#209 => Output: 1 (209's last digit is 9)
#37 => Output: 3 (19 + 9 + 9)

#Author: 	Octavian Stoch
#Date:		9/23/2019

import random

randomN = random.randrange(100)

def love9():
	output 				= 1
	randomNumberLength 	= findNumberOfDigits(randomN)
	listOf9s			= [9,19,29,39,49,59,69,79,89,99]
	possibleAnswers		= []



	print ("The random number is: ", randomN, "\n", "The last digit in the string is: ", str(randomN)[-1], "\n")
	if (str(randomN)[-1] == str(9)):
		print("Congrats the last digit is 9!")
		print (output)

	elif True: 
		xeno 	= 0
		morph	= 0
		for i in range(len(listOf9s)):
			print (listOf9s[xeno] + listOf9s[morph])
			possibleAnswers.append(listOf9s[xeno] + listOf9s[morph])
			morph += 1
		print (possibleAnswers)

	print ("\n\n\nOutput: ", output)



	
	#print the last digit of str(randomN)

	#print (output, "\n", randomN, "\n", randomNumberLength)
	#if last digit of n is "9" then output 1

def findNumberOfDigits(n): #find the number of digits of random integer
	out = 0
	for i in range(len(str(n))):
		out += 1
	return out

love9()