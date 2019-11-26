# Write a Java program to print the count of duplicate words from a given statement e.g. if given String is "Java and JavaScript are totally different, JavaScript follows Java" 

# Algorithm
1.(Firstly in given Statement has Many Capital letters and Small letters ) so first convert in lowercase.
2. (statement has many spaces and one  "," special Character) so Clean it using regular expression. i use "\s*,\s*" then replace to space.
3. after remove "," i spilt into token by removing space.
4. Here i use Hashset datastructure. We know Hashset do not allow duplicate words.
5. create a function "duplicate_test", which resturns set type object.
6. Then i pass input statement into function, and check input statement is empty or not.
7. then i splited into token , and create a another hashset called set.
8. then i take each token and check,over the loop add() returns false when token already exist in hashset, and find duplicate and return those token.

# output: 
Number of Splited Token 10
[java, javascript]
