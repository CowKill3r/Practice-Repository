#Author: Octavian Stoch
#rules of the problem:
# 1: nobody makes mistakes or forgets
# 2: if X -> Y then Y -> X
import sys

def warmup1 ():
    finalAnswer = []
    maxNum = 0
    inputList = sys.stdin.readline()
    removeZeros(inputList)

def removeZeros (opt):
    newList = []
    for nums in opt:
        if nums == '\n':
            break
        elif nums != '0':
            newList.append(int(nums))
        else:
            None
    print (newList)

if __name__ == "__main__":
    warmup1()