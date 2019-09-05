#Author: Octavian Stoch
#Implement a job scheduler which takes in a function 'f', and calls f after n milliseconds

import sys, time, math, random

timeList = []

def timeWizard():

    for randoms in range(20): #get a bunch of random times in miliseconds
        n = random.randint(1, 10)
        timeList.append(n)
    
def scheduler(f):
    timeWizard()

    while timeList != []:
        n = timeList.pop()
        print("Sleeping for: ", n, "seconds")
        time.sleep(n)
        f()
        print("function 'f' has been called after ", n, " seconds!", "\n")


def f():
    print("Im the function 'f' that is being called!")

if __name__ == "__main__":
    scheduler(f)