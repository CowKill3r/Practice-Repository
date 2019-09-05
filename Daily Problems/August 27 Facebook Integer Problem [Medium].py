#Author: Octavian Stoch
#Date: 8/27/2019
#
#
#Given a multiset of integers, return whether it can be partitioned into two subsets whose sums are the same.
#For example, given the multiset {15, 5, 20, 10, 35, 15, 10}, it would return true, since we can split 
#it up into {15, 5, 10, 15, 10} and {20, 35}, which both add up to 55.
#Given the multiset {15, 5, 20, 10, 35}, it would return false, since we can't split it up into two subsets that add up to the same sum.
import sys, random

def checkForMultiset():
	
	num1 = random.randrange(20) #make a bunch of random integers range[0 - 20]
	num2 = random.randrange(20)
	num3 = random.randrange(20)
	num4 = random.randrange(20)
	num5 = random.randrange(20)

	myList = [num1, num2, num3, num4, num5]

	print(myList) #print the randomly generated list

	accum = 1

	for every in myList:
		print(every, " | ", every + myList[1])


if __name__ == "__main__":
    checkForMultiset()