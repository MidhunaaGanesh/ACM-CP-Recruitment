# ACM-CP-Recruitment
ACM CP Recruitment
1. Factory Machines:
    1.)n is the number of machines, and t is the target number of products.
    2.)The array k stores the time required by each machine to make one product.
    3.)low and high represent the possible minimum and maximum answers.
    4.)mid is the time we are testing.
    5.)mid / k[i] tells us how many products machine i can make in that time.
    6.)If the total number of products is at least t, we try a smaller time.
    7.)Otherwise, we increase the time.
