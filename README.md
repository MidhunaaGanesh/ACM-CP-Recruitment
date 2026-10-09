# ACM-CP-Recruitment
ACM CP Recruitment\n
Part A:
    1. Factory Machines:
        1.)n is the number of machines, and t is the target number of products.
        2.)The array k stores the time required by each machine to make one product
        3.)low and high represent the possible minimum and maximum answers.
        4.)mid is the time we are testing.
         5.)mid / k[i] tells us how many products machine i can make in that time.
        6.)If the total number of products is at least t, we try a smaller time.
        7.)Otherwise, we increase the time.

   2. Movie Festival:\n
      1.)movies[i][0] stores the starting time.
      2.)movies[i][1] stores the ending time.
      3.)Arrays.sort() sorts the movies by ending time.
      4.)lastEnd stores the ending time of the last movie selected.
      5.)If the next movie starts at or after lastEnd, we can watch it.
      6.)We increase count and update lastEnd

   3. Road Reparation:\n
    1.)Sort roads by increasing cost.
    2.)Consider the cheapest road first.
    3.)Add the road if it connects two different groups.
    4.)Skip it if it creates a cycle.
    5.)Continue until all cities are connected or all roads have been checked.

    4. Edit Distance
       1.)dp[i][j] means the minimum operations required to convert the first i characters of string a into the first j characters of string b.
       2.)dp[i][0] = i: delete all i characters.
       3.)dp[0][j] = j: insert all j characters.
       4.)If the two current characters are equal, no extra operation is needed:
            i)dp[i][j] = dp[i-1][j-1]
       5.)If they are different, choose the cheapest operation:
           ii)Replace: dp[i-1][j-1]
       6.)Delete: dp[i-1][j]\n
       7.)Insert: dp[i][j-1n
       8.)Add 1 for the chosen operation.
       9.)The answer is stored in dp[n][m].

    5.

       
