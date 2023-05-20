# 10dayschallenge

challenge for macbook

First code is for iterative method of Pascal 's Triangle
The steps are as follows:
1)First, we will consider i for number of rows and j for number of columns.
2)After that, we will simply calculate the value of the combination using a loop.
3)Each first column will have 1, so first print the value of variable number.
4)For each i loop j will run from 0 to i. And in each iteration, we will multiply (i-j) with the number variable and divide the number variable by (j+1).

Second code is for recursive method to print Pascal 's Triangle
The steps are as follows:
1)The first row contains only a single number, which is 1.
2)The base condition is that, if the (column = 0) or (row = column) we would return 1.
3)Each subsequent row is constructed by adding the two numbers directly above it. The outermost numbers of each row are always 1.
4)To determine the value at a particular position (row, column) in the triangle, you sum the two values above it: the number at position (row-1, column-1) and the number at position (row-1, column).

Third code is for memoization method to print Pascal's Triangle.
The steps are as follows:
1)In Memoization, we have store the calculated Pascal value of (row, column) in the memory, when we need to find the value of (row, column) first we have search in the memory whether we have already calculated the value of (row, column) if the value is already calculated we would simply use the calculated value.
2)we have stored value with the help of HashMap in Java, it is stored as <key, value> pairs, and the value of (row, column) would be stored to its associated key. The .get(key) method is used to get the value of the key.
3)If the value is not found in the memory, the value of the key would be newly calculated. The newly calculated value will be kept in the memory using .put(key) method.
