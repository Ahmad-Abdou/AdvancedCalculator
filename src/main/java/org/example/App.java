package org.example;

public class App
{
    public static void main( String[] args )
    {

        Calculator cal = new CalculatorClass();
        int result = 0;
        cal.menu();
        while(true){
            int temp = 0;
            System.out.print("Enter a Number or make a result = : ");
            String input = Calculator.getInput();
            if(input.equalsIgnoreCase("=")){
                System.out.println("Result : "+ result);
                result =0;
                continue;
            }
            System.out.println("Choose your operation + - * / :");
            String op = Calculator.getInput();
            if(input.equalsIgnoreCase("=")){
                System.out.println("Result : "+result);
                result = 0;
                continue;
            }
            switch ((op)){
                case "=":
                    System.out.println("Result : "+ result );
                    result = 0;
                case "+":
                    temp = cal.addition(Integer.parseInt(input), result);
                    result = temp;
                    break;
                case "-":
                    temp = cal.abstraction(Integer.parseInt(input),result);
                    result = temp;
                    break;
                case "*":
                    temp = cal.multiplication(Integer.parseInt(input),result);
                    result = temp;
                    break;
                case "/":
                    temp = cal.division(Integer.parseInt(input),result);
                    result= temp;
                    break;
                default:
                    System.out.println("Operation is not valid");
            }
        }


    }
}
