# ADT-Programming-Assignment-3
Krittameth Tansuwan  
Student ID: 672115002

# About this program  
This program reads [.txt] or [.csv] file type, converts the infix expression into a postfix expression  
, display the valid and the invalid expression, and display how many valid/invalid expression inside the text file  

# How to use  
1. Open the terminal in the java file's directory.
2. Enter **javac Main.java** in terminal.
3. Enter **java Main.java [.TXT or .CSV file's directory]** to run the java code
  
**javac Main.java**  
**java Main.java input1.txt**  
## Expected output:  
Expression 1:  
Infix expression: (5+3)*(2-(8/4))  
Valid expression.  
Postfix expression: 53+284/-*  
  
Expression 2:  
Infix expression: ((7+6)*(5-2))/(4+1)  
Valid expression.  
Postfix expression: 76+52-*41+/  
  
Expression 3:  
Infix expression: 15-((3*8)/(2+2))  
Valid expression.  
Postfix expression: 1538*22+/-  
  
Expression 4:  
Infix expression: (9+(3-1)*4)/(6-2)  
Valid expression.  
Postfix expression: 931-4*+62-/  
  
Expression 5:  
Infix expression: (12/(4+2))+((6-3)*2)  
Valid expression.  
Postfix expression: 1242+/63-2*+  
  
Expression 6:  
Infix expression: 18-((6+2)*3)+(5*2)  
Valid expression.  
Postfix expression: 1862+3*-52*+  
  
Expression 7:  
Infix expression: (5*(7-3)+2)/(8-4)  
Valid expression.  
Postfix expression: 573-*2+84-/  
  
Expression 8:  
Infix expression: (24/(4+2))*(3+1)-7  
Valid expression.  
Postfix expression: 2442+/31+*7-  
  
Expression 9:  
Infix expression: ((5+2)*(8-3))/(9/3)  
Valid expression.  
Postfix expression: 52+83-*93//  
  
Expression 10:  
Infix expression: (20/(2*5))+((7-3)*2)  
Valid expression.  
Postfix expression: 2025*/73-2*+  
  
Expression 11:  
Infix expression: (9*3)-((6/2)+(4*2))  
Valid expression.  
Postfix expression: 93*62/42*+-  
  
Expression 12:  
Infix expression: (30/(6-2))*((5+1)/2)  
Valid expression.  
Postfix expression: 3062-/51+2/*  
  
Expression 13:  
Infix expression: ((16-4)/(8/2))+(3*5)  
Valid expression.  
Postfix expression: 164-82//35*+  
  
Expression 14:  
Infix expression: (2*(3+4)-5)/(5/5)  
Valid expression.  
Postfix expression: 234+*5-55//  
  
Expression 15:  
Infix expression: ((14+6)/(2+2))*(3-1)  
Valid expression.  
Postfix expression: 146+22+/31-*  
  
Expression 16:  
Infix expression: (25/(5+5)*2)+(9-4)  
Valid expression.  
Postfix expression: 2555+/2*94-+  
  
Expression 17:  
Infix expression: (8*(4-2))/((2+3)*2)  
Valid expression.  
Postfix expression: 842-*23+2*/  
  
Expression 18:  
Infix expression: ((10-3)*(6/2))+(4*5)  
Valid expression.  
Postfix expression: 103-62/*45*+  
  
Expression 19:  
Infix expression: ((3+5)>(7-2))&&((4*2)<12)  
Invalid expression.  
  
Expression 20:  
Infix expression: ((6/2)*5)>=((10-3)*2)  
Invalid expression.  
  
Expression 21:  
Infix expression: ((8*(3+2))<(45/5))||((9-2)>5)  
Invalid expression.  
  
Expression 22:  
Infix expression: ((12+6)==(3*6))&&((5+3)!=8)  
Invalid expression.  
  
Expression 23:  
Infix expression: ((7+3)<=(10-2))||((9/3)==3)  
Invalid expression.  
  
Expression 24:  
Infix expression: ((18/3)+2>5)&&((4*2)<=10)  
Invalid expression.  
  
Expression 25:  
Infix expression: ((9*(2+1))>=(25-2))||((6-2)<5)  
Invalid expression.  
  
Expression 26:  
Infix expression: ((5+6)!=(3*4))&&((4+2)>5)  
Invalid expression.  
  
Expression 27:  
Infix expression: (20/(4+1)==4)&&((8-3)<6)  
Invalid expression.  
  
Expression 28:  
Infix expression: (((5+3)*2)-(6/2))>((10/5)+7)  
Invalid expression.  
  
Expression 29:  
Infix expression: ((15-(3*8))/(2+2))<((6*3)-9)  
Invalid expression.  
  
Expression 30:  
Infix expression: (((7+5)*2)/(9-3))==((8+4)/3)  
Invalid expression.  
  
There are 30 expressions in total
Valid expression: 18
Invalid expression: 12
