# Write a Java program to print the count of duplicate words from a given statement e.g. if given String is "Java and JavaScript are totally different, JavaScript follows Java" 

# Algorithm
1.(Firstly in given Statement has Many Capital letters and Small letters ) so first convert in lowercase.
2. (statement has many spaces and one  "," special Character) so Clean it using regular expression. i use "\s*,\s*" then replace to space.
3. after remove "," i spilt into token by removing space.
4. Then take a "String repeat" flag for duplicate token.
5. I use Two loop is use for find duplicate words.
6. Outer loop will select a word and Initialize variable count to 1. 
7. Inner loop will compare the word selected by outer loop with rest of the words.
8. if match found, the count increment by 1, and flag set to "repeat" for avoiding counting again.
9. after i use If condition to check word is > 1 and which signifies that word has duplicate flag.

# output: 
Given Statement java and javascript are totally different, javascript follows java
Clean Statement java and javascript are totally different javascript follows java
No of Token 9
Duplicate Words:
java occurs 2 times
javascript occurs 2 times
