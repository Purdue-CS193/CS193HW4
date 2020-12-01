public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;

        switch(operation) {
            case ADD:
                System.out.println("CS193 sucks");
                break;
            case SUBTRACT:
                System.out.println("CS193 is not everyone's favorite class");
                break;
            case MULTIPLY:
                System.out.println("The CS193 lecturers do not want us to thrive in CS");
                break;
            case DIVIDE:
                if (num2 == 0) {
                    System.out.println("Error: u suck");
                } else {
                    result = num1 / num2;
                }
                break;
        }

        return result;
    }
