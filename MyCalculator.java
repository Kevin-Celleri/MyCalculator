package Project1;
import java.util.Scanner;
public class MyCalculator {
	
	
	
	public static void main(String[] args) {
		
		String mode;
		String operation;
		String restart = "Y";
		
		boolean validOperator;
		
		int amountOfNumbers;
		
		double userNumber;
		
		
		//STORES AND UPDATES FINAL RESULTS AFTER OPERATION IS COMPLETED
		double sum = 0;
		double subtraction = 0;
		double product = 1;
		double division = 0;
		double sinx = 0;
		double cosx = 0;
		double tanx = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//WHILE LOOP RUNS IF USER CHOOSES TO RESTART
		while(restart.equals("Y")){
			System.out.println("Enter the calculator mode: Standard/Scientific?");
			mode = sc.next();
			
			//STANDARD MODE
			
			if(mode.equals("Standard")) {
				System.out.println("The calculator will operate in standard mode.");
				//DO WHILE LOOP TO CHECK VALIDITY OF OPERATION
				do {
					validOperator = true;
					
					//PROMPT USER FOR OPERATION
					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
					operation = sc.next();
					
					//SUM OPERATION
					if(operation.equals("+")) {
						
						System.out.println("How many numbers do you want to add?");
						amountOfNumbers = sc.nextInt();
						System.out.println("Enter " + amountOfNumbers + " userNumber");
						
						for(int i = 1; i<=amountOfNumbers; i++) {
							userNumber = sc.nextDouble();
							sum += userNumber;
						}
						System.out.println("Result: " + sum);
						sum = 0;
						
						System.out.println("Do you want to start over? (Y/N)");
						restart = sc.next();
						if(restart.equals("N")) {
							System.out.println("Goodbye");
						}
						
					//SUBTRACTION OPERATION
					} else if(operation.equals("-")) {
						
						System.out.println("How many numbers do you want to subtract?");
						amountOfNumbers = sc.nextInt();
						System.out.println("Enter " + amountOfNumbers + " userNumber");
						
						for(int i = 1; i<=amountOfNumbers; i++) {
							userNumber = sc.nextDouble();
							if(i==1) {
								subtraction += userNumber;
							} else {
								subtraction -= userNumber;
							}
						}
						System.out.println("Result: " + subtraction);
						subtraction = 0;
						
						System.out.println("Do you want to start over? (Y/N)");
						restart = sc.next();
						if(restart.equals("N")) {
							System.out.println("Goodbye");
						}
						
				    //MULTIPLICATION OPERATION
					} else if(operation.equals("*")) {
						
						System.out.println("How many numbers do you want to multiply?");
						amountOfNumbers = sc.nextInt();
						System.out.println("Enter " + amountOfNumbers + " userNumber");
						
						for(int i = 1; i<=amountOfNumbers; i++) {
							userNumber = sc.nextDouble();
							product *= userNumber;
						}
						System.out.println("Result: " + product);
						product = 1;
						
						System.out.println("Do you want to start over? (Y/N)");
						restart = sc.next();
						if(restart.equals("N")) {
							System.out.println("Goodbye");
						}
						
					//DIVISION OPERATION
					} else if(operation.equals("/")) {
						
						System.out.println("How many numbers do you want to divide?");
						amountOfNumbers = sc.nextInt();
						System.out.println("Enter " + amountOfNumbers + " userNumber");
						
						for(int i = 1; i<=amountOfNumbers; i++) {
							userNumber = sc.nextDouble();
							if(i==1) {
								division = userNumber;
							} else {
								division /= userNumber;
							}
						}
						
						System.out.println("Result: " + division);
						division = 0;
						
						System.out.println("Do you want to start over? (Y/N)");
						restart = sc.next();
						if(restart.equals("N")) {
							System.out.println("Goodbye");
						}
						
					} else {
						System.out.println("Invalid operator " + operation);
						validOperator = false;
						//WHEN FALSE, RESTARTS DO WHILE LOOP
					}
				} while(!validOperator);
				
				
			//SCIENTIFIC MODE
				
			} else if (mode.equals("Scientific")) {
				System.out.println("The calculator will operate in scientific mode.");
				//DO WHILE LOOP TO CHECK VALIDITY OF OPERATION
				do {
					validOperator = true;
					
					//PROMPT USER FOR OPERATION
					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
					operation = sc.next();
					
					//SUM OPERATION
					if(operation.equals("+")) {
						
						System.out.println("How many numbers do you want to add?");
						amountOfNumbers = sc.nextInt();
						System.out.println("Enter " + amountOfNumbers + " userNumber");
						
						for(int i = 1; i<=amountOfNumbers; i++) {
							userNumber = sc.nextDouble();
							sum += userNumber;
						}
						System.out.println("Result: " + sum);
						sum = 0;
						
						System.out.println("Do you want to start over? (Y/N)");
						restart = sc.next();
						if(restart.equals("N")) {
							System.out.println("Goodbye");
						}
					
					//SUBTRACTION OPERATION	
					} else if(operation.equals("-")) {
						
						System.out.println("How many numbers do you want to subtract?");
						amountOfNumbers = sc.nextInt();
						System.out.println("Enter " + amountOfNumbers + " userNumber");
						
						for(int i = 1; i<=amountOfNumbers; i++) {
							userNumber = sc.nextDouble();
							if(i==1) {
								subtraction += userNumber;
							} else {
								subtraction -= userNumber;
							}
						}
						System.out.println("Result: " + subtraction);
						subtraction = 0;
						
						System.out.println("Do you want to start over? (Y/N)");
						restart = sc.next();
						if(restart.equals("N")) {
							System.out.println("Goodbye");
						}
					
					//MULTIPLICATION OPERATION
					} else if(operation.equals("*")) {
						
						System.out.println("How many numbers do you want to multiply?");
						amountOfNumbers = sc.nextInt();
						System.out.println("Enter " + amountOfNumbers + " userNumber");
						
						for(int i = 1; i<=amountOfNumbers; i++) {
							userNumber = sc.nextDouble();
							product *= userNumber;
						}
						System.out.println("Result: " + product);
						product = 1;
						
						System.out.println("Do you want to start over? (Y/N)");
						restart = sc.next();
						if(restart.equals("N")) {
							System.out.println("Goodbye");
						}
					
					//DIVISION OPERATION
					} else if(operation.equals("/")) {
						
						System.out.println("How many numbers do you want to divide?");
						amountOfNumbers = sc.nextInt();
						System.out.println("Enter " + amountOfNumbers + " userNumber");
						
						for(int i = 1; i<=amountOfNumbers; i++) {
							userNumber = sc.nextDouble();
							if(i==1) {
								division = userNumber;
							} else {
								division /= userNumber;
							}
						}
						System.out.println("Result: " + division);
						division = 0;
						
						System.out.println("Do you want to start over? (Y/N)");
						restart = sc.next();
						if(restart.equals("N")) {
							System.out.println("Goodbye");
						}
						
					//SIN OPERATION
					} else if(operation.equals("sin")) {
						
						System.out.println("Enter a number in radians to find the sine");
						sinx = sc.nextDouble();
						
						System.out.println("Result: " + Math.sin(sinx));
						sinx = 0;
						
						System.out.println("Do you want to start over? (Y/N)");
						restart = sc.next();
						if(restart.equals("N")) {
							System.out.println("Goodbye");
						}
					
					//COS OPERATION
					} else if(operation.equals("cos")) {
						
						System.out.println("Enter a number in radians to find the cosine");
						cosx = sc.nextDouble();
						
						System.out.println("Result: " + Math.cos(cosx));
						cosx = 0;
						
						System.out.println("Do you want to start over? (Y/N)");
						restart = sc.next();
						if(restart.equals("N")) {
							System.out.println("Goodbye");
						}
					
					//TAN OPERATION
					} else if(operation.equals("tan")) {
					
						System.out.println("Enter a number in radians to find the tangent");
						tanx = sc.nextDouble();
						
						System.out.println("Result: " + Math.tan(tanx));
						tanx = 0;
						
						System.out.println("Do you want to start over? (Y/N)");
						restart = sc.next();
						if(restart.equals("N")) {
							System.out.println("Goodbye");
						}
						
					} else {
						System.out.println("Invalid operator " + operation);
						validOperator = false;
						//WHEN FALSE, RESTARTS DO WHILE LOOP
					}
				} while(!validOperator);
				
			}
		}
	}

}