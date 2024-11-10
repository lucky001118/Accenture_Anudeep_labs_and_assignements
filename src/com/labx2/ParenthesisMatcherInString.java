package com.labx2;

public class ParenthesisMatcherInString {

    /*
    Question 5: Match the Parenthesis
	Write a function in your preferred programming language that takes as input a sentence containing nested parentheses and the position of an opening parenthesis.
	The function should find the corresponding closing parenthesis and return its position.
	For example, if the input sentence is:
	"Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing."
	And the position of the opening parenthesis is 10, the function should return 79, which is the position of the corresponding closing parenthesis.
     */
    // Question mistake
    /*
    Note: For the position of the opening parenthesis is 10, 79 is not the closing parenthesis position it is closing parenthesis
            position of second parenthesis for position 10 open parenthesis the closing parenthesis is at position of 104.
     */

    public int findTheClosingParenthesis(int openParenthesisPosition,String sentence){

        //checking the opening position containing the open parenthesis or not
        if (sentence.charAt(openParenthesisPosition)!='('){
            throw new IllegalArgumentException("No opening parenthesis found at this position "+openParenthesisPosition);
        }

        // Stack to keep track of nested parenthesis
        int countNumberOfOpenParenthesis = 0;

        for (int i=openParenthesisPosition;i<sentence.length();i++){
//            countNumberOfOpenParenthesis++;
            char currentPositionCharacter = sentence.charAt(i);

            if (currentPositionCharacter=='('){
                //adding in clout if any opening parenthesis will come between first opening parenthesis
                countNumberOfOpenParenthesis++;
            } else if (currentPositionCharacter==')') {
                //if we found closing parenthesis then -1 on count bcz we found closing parenthesis
                countNumberOfOpenParenthesis--;

                //if count will 0 then the closing parenthesis for first parenthesis is found return the position
                if (countNumberOfOpenParenthesis==0){
                    /* ensuring that in between the first opening parenthesis all parenthesis are closed and this closing
                    parenthesis is related to first opening parenthesis. */
                    return i;
                }
            }
        }
//        return countNumberOfOpenParenthesis;
        throw  new IllegalArgumentException("The closing parenthesis of the opening parenthesis that you have provided is not found.");
    }

    public static void main(String[] args) {
        ParenthesisMatcherInString parenthesisMatcherInString = new ParenthesisMatcherInString();

        String sentence = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
        int openParenthesisPosition = 10;

        //calling the function
        int closingParenthesisPosition = parenthesisMatcherInString.findTheClosingParenthesis(openParenthesisPosition,sentence);

        //msg
        System.out.println("The closing parenthesis for the opening parenthesis at position " + openParenthesisPosition+ " is at position: " + closingParenthesisPosition);

    }
}

