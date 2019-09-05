#n is a positive int, solve with recursion (bottom-up)



def ClimbingStairs(n):
    dp = []
    dp.append(n+1)
    dp[0] = 1
    dp[1] = 1

    for (

    print(dp)

if __name__ == "__main__":
    ClimbingStairs(0)