# TriangleQuestion

#HOW TO RUN THIS PROJECT?#
###FROM THE IDE:###
1. Open the project in an IDE like Eclipse.
2. You need Java version .
3. Go to com.triangle package.
4. Click on class MainTriangle.
5. Check valid input filepath given.
6. Hit "Run" in the IDE.
7. Output will be displayed on console


#ASSUMPTIONS#
1. Input file should be provided from correct path.
2. Input text files are placed under the 'input' folder.
3. Triangle can have integer values.
    

#TECHNOLOGY STACK#
1. Java 1.8
2. Eclipse Neon 4.6.0
3. JUnit 4


#DESIGN DISCUSSION#
1. The program gets the input text file from the path provided.
2. The file input is fetched and saved in an ArrayList of integer ArrayList.
3. ArrayList is considered since knowing the array size can be difficult.
4. ArrayList is passed to a function to calculate the maximum total.
5. Bottom up approach is followed to find the find row by row.
6. The total is saved in an array and the array values keeps updating.
7. The first element in the final array will provide the maximum sum total value.


### Choice of Data Structure ###
1. An ArrayList of integer arraylist is considered to save the triangle values from input file.
2. This makes it easier since row count is not needed to be known before since the arraylist can dynamically increase.


### Alternative data structure ###
1. If the row count is previously known, you could use 2D array instead of arraylist making accessing of elements easier.


#TESTS#
1. Tests are written using JUnit tests for MaxTotal class.