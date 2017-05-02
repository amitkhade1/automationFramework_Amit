#Author: Amit Khade

Feature: To implement calculator

@add
Scenario: To verify addition is performed
Given user is providing two numbers "4" and "5"
	Then "add" numbers
	Then verify result is "11"

@add
Scenario: To verify substraction is performed
Given user is providing two numbers "2" and "6"
	Then "substract" numbers
	Then verify result is "-4"

@add
Scenario: To verify multiplication is performed
Given user is providing two numbers "3" and "9"
	Then "multiply" numbers
	Then verify result is "27"
	
@add	
Scenario: To verify devide is performed
Given user is providing two numbers "8" and "2"
	Then "devide" numbers
	Then verify result is "4"

@add
Scenario: To verify square root is calculated
Given user is providing a number "4"
	Then "square" numbers
	Then verify result is "16"

@so
Scenario Outline: To verify addition is performed
Given user is providing two numbers "<num1>" and "<num2>"
	Then "<operation>" numbers
	Then verify result is "<result>"

Examples:
|num1|num2|operation|result|
|5|4|add|9|
|15|2|substract|13|
|14|6|multiply|84|
|25|5|devide|5|

@so
Scenario Outline: To verify square is calculated.
Given user is providing a number "<num1>"
	Then "square" numbers
	Then verify result is "<result>"
Examples:
|num1|result|
|4|16|
|7|49|