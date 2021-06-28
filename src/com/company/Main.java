package com.company;

public class Main {

    public static void main(String[] args) {
        double firstValue;
        double secondValue;
        double answer;


        // initialize variables
        firstValue = 22;
        secondValue = 7;
        String operator = "v";
        System.out.println(doArithmetic(firstValue, secondValue,operator));



    }

    public static double doArithmetic(double firstNumber, double secondNumber, String operator){
        double answer = 0;
        switch (operator) {
            case "+":
                answer = firstNumber + secondNumber;
                return answer;
            case "-":
                answer = firstNumber - secondNumber;
  //              System.out.println(answer);
                return answer;
            case "*":
                answer = firstNumber * secondNumber;
 //               System.out.println(answer);
                return answer;
            case "/":
                answer = firstNumber / secondNumber;
 //               System.out.println(answer);
                return answer;
            default:
                System.out.println("Enter a valid operator");
                break;
        }

        return answer;


    }

    public static double doArithmetic(double firstNumber, double secondNumber, String operator){
        double answer = 0;
        switch (operator) {
            case "+":
                answer = firstNumber + secondNumber;
                return answer;
            case "-":
                answer = firstNumber - secondNumber;
                //              System.out.println(answer);
                return answer;
            case "*":
                answer = firstNumber * secondNumber;
                //               System.out.println(answer);
                return answer;
            case "/":
                answer = firstNumber / secondNumber;
                //               System.out.println(answer);
                return answer;
            default:
                System.out.println("Enter a valid operator");
                break;
        }

        return answer;


    //create a method that checks two numbers and uses a switch to return max, min
}
