#include <bits/stdc++.h>
using namespace std;
//definition of functions
struct Stack *create (int max);
int stackFull (struct Stack *stack);
int stackEmpty (struct Stack *stack);
void pushElement (struct Stack *stack, int item);
int popElement (struct Stack *stack);
int peekElement (struct Stack *stack);
int checkOperand (char ch);
int precedence (char ch);
int postfix (char *expression);
void reverse (char *exp);
void brackets (char *exp);
void conversionInfixToPrefix (char *exp);
// A structure to represent a stack
struct Stack
{
  int top;
  int maxSize;
  int *array;
};
int main ()
{
  int n = 10;
  cout << "The infix expression is: \n";
  char expression[] = "(P+(Q*R)/(S-T))";
  cout << expression << "\n";
  conversionInfixToPrefix (expression);
  cout << "The prefix expression is: \n";
  cout << expression;
  return 0;
}
//stack implementation
struct Stack * create (int max)
{
  struct Stack *stack = (struct Stack *) malloc (sizeof (struct Stack));
  stack->maxSize = max;
  stack->top = -1;
  stack->array = (int *) malloc (stack->maxSize * sizeof (int));
  return stack;
}

// Checking with this function is stack is full or not
int stackFull (struct Stack *stack)
{
  if (stack->top == stack->maxSize - 1)
    {
      cout << "Will not be able to push maxSize reached\n";
    }
  // We know array index from 0 and maxSize starts from 1
  return stack->top == stack->maxSize - 1;
}

// if Stack is empty when top is equal to -1 and return true
int stackEmpty (struct Stack *stack)
{
  return stack->top == -1;
}

// Push function it inserts value in stack and increments stack top by 1
void pushElement (struct Stack *stack, int item)
{
  if (stackFull (stack))
    return;
  stack->array[++stack->top] = item;
}

// pop Function it remove an item from stack and decreases top by 1 
int popElement (struct Stack *stack)
{
  if (stackEmpty (stack))
    return INT_MIN;
  return stack->array[stack->top--];
}

// Function to return the top from stack without removing it 
int peekElement (struct Stack *stack)
{
  if (stackEmpty (stack))
    return INT_MIN;
  return stack->array[stack->top];
}

// A function check the given character is operand 
int checkOperand (char ch)
{
  return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
}

// Fucntion to compare precedence if return larger value means higher precedence 
int precedence (char ch)
{
  switch (ch)
    {
    case '+':
    case '-':
      return 1;

    case '*':
    case '/':
      return 2;

    case '^':
      return 3;
    }
  return -1;
}

// The function for infix to postfix conversion 
int postfix (char *expression)
{
  int i, j;
  struct Stack *stack = create (strlen (expression));
  if (!stack)		
    return -1;

  for (i = 0, j = -1; expression[i]; ++i)
    {
      // checking the character we scanned is operand or not
      if (checkOperand (expression[i]))
	expression[++j] = expression[i];

      // if we scan character push it to the stack
      else if (expression[i] == '(')
	pushElement (stack, expression[i]);

      //if we scan character we need to pop and print from the stack  
      else if (expression[i] == ')')
	{
	  while (!stackEmpty (stack) && peekElement (stack) != '(')
	    expression[++j] = popElement (stack);
	  if (!stackEmpty (stack) && peekElement (stack) != '(')
	    return -1;		// invalid expression              
	  else
	    popElement (stack);
	}
      else			// if an operator
	{
	  while (!stackEmpty (stack)
		 && precedence (expression[i]) <=
		 precedence (peekElement (stack)))
	    expression[++j] = popElement (stack);
	  pushElement (stack, expression[i]);
	}

    }

  // if all first expression characters are scanned
  // adding all left elements from stack to expression
  while (!stackEmpty (stack))
    expression[++j] = popElement (stack);
    expression[++j] = '\0';
    
    return 0;
}

void reverse (char *exp)
{				//reverse function for expression

  int size = strlen (exp);
  int j = size, i = 0;
  char temp[size];

  temp[j--] = '\0';
  while (exp[i] != '\0')
    {
      temp[j] = exp[i];
      j--;
      i++;
    }
  strcpy (exp, temp);
}

void brackets (char *exp)
{
  int i = 0;
  while (exp[i] != '\0')
    {
      if (exp[i] == '(')
	exp[i] = ')';
      else if (exp[i] == ')')
	exp[i] = '(';
      i++;
    }
}

void conversionInfixToPrefix (char *exp)
{
  int size = strlen (exp);
  reverse (exp);
  brackets (exp);
  postfix (exp);
  reverse (exp);
}