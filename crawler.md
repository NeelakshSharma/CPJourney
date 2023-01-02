# Tips and Tricks Crawler
## Ceil function alternatives
#### Approach 1
```
int ceil2(int a, int b) {
    return (a + b - 1) / b;
}
```
#### Approach 2
`(a - 1)/b + 1`  is used instead of  `(a + b - 1) / b`  to prevent integer overflow when  `a`  and  `b`  is large. However, it does not work if  a=0a=0, so we add an if statement.

```
int ceil2(int a, int b) {
    if (a == 0) return 0;
    return (a - 1)/b + 1;
}
```
#### Approach 3
```
int ceil2(int a, int b) {
    int c=a/b;
    if(a % b ! =0) c++;
    return c;
}
```

#### Approach 4
```
int ceil2(int a, int b){
    int c = a / b;
    if (c * b < a) c++;
    return c;
}
```
---
## Count all possible paths from top left to bottom right of a mXn matrix
In this approach, We have to calculate  m+n-2Cn-1 here which will be (m+n-2)! / (n-1)! (m-1)!  
m = number of rows, n = number of columns

Total number of moves in which we have to move down to reach the last row = m – 1 (m rows, since we are starting from (1, 1) that is not included)  
Total number of moves in which we have to move right to reach the last column = n – 1 (n column, since we are starting from (1, 1) that is not included)

Down moves = (m – 1)  
Right moves = (n – 1)  
Total moves = Down moves + Right moves = (m – 1) + (n – 1)

Now think of moves as a string of ‘R’ and ‘D’ characters where ‘R’ at any ith index will tell us to move ‘Right’ and ‘D’ will tell us to move ‘Down’. Now think of how many unique strings (moves) we can make where in total there should be (n – 1 + m – 1) characters and there should be (m – 1) ‘D’ character and (n – 1) ‘R’ character?

Choosing positions of (n – 1) ‘R’ characters results in the automatic choosing of (m – 1) ‘D’ character positions

The number of ways to choose positions for (n – 1) ‘R’ character =  Total positions C  n – 1 =  Total positions C  m – 1
