#Author: Octavian Stoch
#Implement an autocomplete system.
#That is, given a query string 's' and a set of all pssible query strings,
#return all strings in the set that have 's' as a prefix.

import sys

s = 'do'                                                      #query string
myStrings = ['dog', 'deerdo', 'deal', 'delve', 'dido', 'don'] #set of all possible query 

def queryLength(inputString):
    jacks = 0
    for letters in inputString:
        #print (letters)
        jacks += 1
        #print(jacks)
    return jacks


def func1():
    queryLength(s)
    for allStrings in myStrings:
        if s in allStrings[0:queryLength(s)]:
            print(allStrings)

if __name__ == "__main__":
    func1()
    #queryLength(s)