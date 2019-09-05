#Author: Octavian Stoch
#Date: July 21, 2019

#You are given an M by N matrix consisting of booleans that 
#represents a board. Each True boolean represents a wall. Each False boolean 
#represents a tile you can walk on.

#Given this matrix, a start coordinate, and an end coordinate, 
#return the minimum number of steps required to reach the end coordinate from the start. 
#If there is no possible path, then return null. You can move up, left, down, and right. 
#You cannot move through walls. You cannot wrap around the edges of the board.
import random


def numSteps():
	testMatrix = [['F','F','F','F','F'] , ['F','F','F','F','F'] , ['F','F','F','F','F'] , ['F','F','F','F','F']]

	

def makeMatrix(n, m): #randomly Generate a matrix with values n and m between 1 and 10
	#n = column
	#m = row
	columnMatrix = []
	matrix = []

	print (n, m)

	for makecolumns in range(n): #create columns
		columnMatrix.append('F')
		#print(columnMatrix) 

	for makerows in range(m): #create the rows by copying the list and making a bunch of mini lists
		field = [] #make new lists each time
		for j in range(n):
			if random.randrange(1,100) >= 50:
				field.append('T')
			else:
				field.append('F')
		matrix.append(field) #clear it every time
		matrix.append(columnMatrix.copy())

	print ('\n'.join([' '.join(row) for row in matrix]))

	#random number between 1 and 100 to change each value in matrix to 'T', if >=50 then 'T' else none



if __name__ == "__main__":
    makeMatrix(random.randrange(1,10), random.randrange(1,10)) #very inneficient because of two for loops O(2n) :( 
