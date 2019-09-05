#Author: Octavian Stoch
#Staircase with 'n' steps, you can climb up the steps 1 or 2 at a time.
#the order of the steps matter
#
#example: N = 4, there are 5 unique ways
#   1, 1, 1, 1
#   2, 1, 1
#   1, 2, 1
#   1, 1, 2
#   2, 2

import sys

possibilities = []
buffer        = []
n = 4
trigger = False

def func1():
    if trigger != True:
        calculateSteps()
        print('Possibilities: ',possibilities, '\n', 'buffer: ', buffer)
        
        if checkPossibilites() is checkBuffer(): #TODO: if buffer and possiblities are the same, do another round minus the previous possibility
            print('both are the same')

def checkPossibilites():
    for all in possibilities:
        print (all)

def checkBuffer():
    for all in buffer:
        print(all)
    
def calculateSteps():

    while sum(possibilities) != n: 
        
        print(possibilities)
        
        if sum(possibilities) % 2 is True:
            possibilities.append(1)
            print(possibilities)

        else:
            possibilities.append(2)
            print(possibilities)

    for all in possibilities:
        buffer.append(all) #append possibilites into buffer

    #TODO: inside while loop to calculate possible non repeating steps (plan B)
        


if __name__ == "__main__":
    func1()