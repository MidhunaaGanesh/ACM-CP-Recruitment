# ACM-CP-Recruitment
ACM CP Recruitment\n
Part A:\n
1. Factory Machines:\n
    1.)n is the number of machines, and t is the target number of products.\n
    2.)The array k stores the time required by each machine to make one product\n
    3.)low and high represent the possible minimum and maximum answers.\n
    4.)mid is the time we are testing.\n
    5.)mid / k[i] tells us how many products machine i can make in that time.\n
    6.)If the total number of products is at least t, we try a smaller time.\n
    7.)Otherwise, we increase the time.\n

   2. Movie Festival:\n
      1.)movies[i][0] stores the starting time.\n
      2.)movies[i][1] stores the ending time.\n
      3.)Arrays.sort() sorts the movies by ending time.\n
      4.)lastEnd stores the ending time of the last movie selected.\n
      5.)If the next movie starts at or after lastEnd, we can watch it.\n
      6.)We increase count and update lastEnd\n

   3. Road Reparation:\n
    1.)Sort roads by increasing cost.\n
    2.)Consider the cheapest road first.\n
    3.)Add the road if it connects two different groups.\n
    4.)Skip it if it creates a cycle.\n
    5.)Continue until all cities are connected or all roads have been checked.\n

    4. Edit Distance\n
       1.)dp[i][j] means the minimum operations required to convert the first i characters of string a into the first j characters of string b.\n
       2.)dp[i][0] = i: delete all i characters.\n
       3.)dp[0][j] = j: insert all j characters.\n
       4.)If the two current characters are equal, no extra operation is needed:\n
            i)dp[i][j] = dp[i-1][j-1]\n
       5.)If they are different, choose the cheapest operation:\n
           ii)Replace: dp[i-1][j-1]\n
       6.)Delete: dp[i-1][j]\n
       7.)Insert: dp[i][j-1n
       8.)Add 1 for the chosen operation.\n
       9.)The answer is stored in dp[n][m].\n

       
