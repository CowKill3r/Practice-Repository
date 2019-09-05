#Author: Octavian Stoch

# Given a list of numbers and a number k, return whether any two numbers
# from the list add up to k.
# example: given [10, 15, 3, 7] and k = 17; return True since 10 + 7 = 17 = k

import math, sys


#List1                   = [10, 15, 3, 7] #n +2 iterations?
List1                   = [10, 15, 3, 7, 9, 13]
finalList               = []
kValue                  = 19

def func1():
    numberOfValuesInList    = 0
    #print (List1, '\n', kValue, '\n', numberOfValuesInList, '\n')

    for values in List1:
        #print(values)
        numberOfValuesInList += 1
        #print('Number of values in this list is currently: ',numberOfValuesInList)
    
    x = 0
    y = 1
    for values in range(numberOfValuesInList - 1):   
        sum = List1[x] + List1[y]
        print (sum)
        y += 1
        finalList.append(sum)
        if y == numberOfValuesInList:
            #TODO: add for loop to iterater through the whole list but starting from the next base value x = 1, y = 2
            print ('The old value of y is: ', y)
            print ('The old value of x is: ', x, '\n')

            x = 0
            y = 1

            x += 1
            y += 1

            print ('The new value of y is: ',  y)
            print ('The new value of x is: ', x)
            
            for values in range(numberOfValuesInList - y): 
                sum = List1[x] + List1[y]
                print (sum)
                y += 1
                finalList.append(sum)
            
            print ('Old x and y values: ', x, ' ', y)

            x = 2
            y = 3

            for values in range(numberOfValuesInList - y):
                sum = List1[x] + List1[y]
                print (sum)
                y +=1
                finalList.append(sum)
                    


    print("Initial List of Values: ", List1, "\n","The list off all possible summations is: ",finalList)

    if kValue in finalList:
        print (kValue, " is in the given list!", True)
    else:
        print (kValue, " isn't in the given list!", False)

if __name__ == "__main__":
    func1()