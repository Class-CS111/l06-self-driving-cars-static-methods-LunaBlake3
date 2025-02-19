// When you are ready to have your work checked, change the value below from N to Y
// ReadyForSubmission=Y
// YOUR NAME: Blake Luna-Beltran
// CLASS : CS111 3033
// DATE:  02/19/2025

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("My thoughts on the article are:");
		// Part 2: Invoking/calling method
		Main.printCarAnswers();
	}
	
	// Part 1: Creating method definition
	// return type is void //method identifier is "printCarAnswers" // 
	public static void printCarAnswers()    //method header
	{ //method body
		System.out.println("\033[1m" + "Should a self-driving car prioritize the safety of its passengers or pedestrians?" + "\033[0m");
		System.out.println("\tSelf driving cars should preserve the health of the most amount of people. However if it was the life of a pedestrian or a passenger, then the passenger should be prioritized. This is due to that should the car be operating correctly, it would be the pedestrians fault that they were in front of the car(ex. jaywalking). The passenger should not die due to the decisions of the pedestrian. ");
		System.out.println("\033[1m" + "What factors should the car's algorithms consider when making such determinations?" + "\033[0m");
		System.out.println("\tKnowledge of passengers (weight, aprox height. from those drawing a consensus on viability of survival) and knowledge of the pedestrian (Location, size) and knowledge of the locations and make of other cars on the road.");
		System.out.println("\033[1m" + "Who should be deciding the algorithms for self-driving cars?" + "\033[0m");
		System.out.println("\tThe rules would be put in place by a body of people appointed by the federal or state government. They should NOT be set by the corporations that make the cars");
	}
}
