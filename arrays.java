
public class arrays {

	public static void main(String[] args) {
		// 1. create an array of int called ages that contains 3, 9, 23, 64, 2, 8, 28, 93
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		// a.
		System.out.println("Last item minus 1st: " + (ages[ages.length - 1] - ages[0]));
		
		// b.
		int[] myAgeArray = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		System.out.println("New last item minus 1st: " + (myAgeArray[myAgeArray.length - 1] - myAgeArray[0]));
		
		// c.
		double counter = 0;
		for (double age : ages) {
			counter += age;
		}
		double avgAge = (counter / ages.length);
		System.out.println("Average age: " + avgAge);
		
		
		
		// 2. create an array of string called names that contains the values sam, tommy, tim, sally, buck, bob
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double charCounter = 0;
		
		for (String name : names) {
			charCounter += name.length();
		}
		System.out.println("Average letters per name: " + (charCounter / names.length));
		
		// 3. [array.length -1]
		
		// 4. array[0]
		
		// 5. create array of int called nameLengths. write a loop to iterate over prev created names array and add length of each name to nameLengths array
		int[] nameLengths = new int[6];
		System.out.println("Length of each name:");
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.println(nameLengths[i]);
		}
		
		// 6. write a loop to iterate over nameLengths and calc the sum of all the elements in the array
		int sumChar = 0;
		for (int length : nameLengths) {
			sumChar += length;
		}
		System.out.println("Number of chars in all names: " + sumChar);
		
		// 7. write a method that takes a string (word) and int (n) as arguments and returns the word concatenated to itself n number of times
		System.out.println(repeatWord("Hello", 3));
		
		// 8. write a method that takes firstNme + lastName and return fullName
		System.out.println(createFullName("Paul", "Tuura"));
		
		// 9. write a method that takes an array of int and returns true if sum of all ints is > 100
		int[] under100 = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(isOver100(under100));
		System.out.println(isOver100(ages));
		
		// 10. write a method that takes and array of double and returns avg of all elements
		double[] doubleArray1 = {1.0, 2.0, 2.5, 3.3, 5.6, 14.2};
		System.out.println(avgDoubleArray(doubleArray1));
		
		//11. write a method that takes two arrays of double and returns true if avg of elements in first array > avg of 2nd
		double[] doubleArray2 = {2.3, 6.1, 3.3, 4.1, 6.6, 3.8, 2.1, 1.6, 2.4};
		System.out.println(isAvgBigger(doubleArray1, doubleArray2));
		
		//12. write a method called willBuyDrink that takes boolean isHotOutside, and a double moneyInPocket, 
		//and returns true if it is hot outside and if moneyInPocket is greater than 10.50
		boolean isHotOutside = false;
		double moneyInPocket = 45.26;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		//13. I created a method that will tell me if the vikings are in the playoffs, based on how the week 16/17 games play out.
		// the method takes 4 booleans, which will be the result of a given game
		boolean vikesOverLions = true;
		boolean titansOverRedskins = false;
		boolean texansOverEagles = false;
		boolean vikesOverBears = false;
		System.out.println(willVikingsMakePlayoffs(vikesOverLions, titansOverRedskins, texansOverEagles, vikesOverBears));
		
		
	}
// 7. 
	public static String repeatWord(String word, int n) {
		String result = ""; 
		for (int i=0; i < n; i++) {
			result += word;
		}
		return result;
	}
// 8.
	public static String createFullName(String first, String last) {
		String fullName = first + " " + last;
		return fullName;
	}
// 9.
	public static boolean isOver100(int[] numbers) {
		int counter = 0;
		for (int number : numbers) {
			counter += number;
		}
		return (counter > 100);
	}
// 10.
	public static double avgDoubleArray(double[] numbers) {
		double counter = 0;
		for (double number : numbers) {
			counter += number;
		}
		return (counter / numbers.length);
	}
// 11.
	public static boolean isAvgBigger(double[] array1, double[] array2) {
		double counter1 = 0;
		for (double number : array1) {
			counter1 += number;
		}
		double counter2 = 0;
		for (double number : array2) {
			counter2 += number;
		}
		return ((counter1 / array1.length) > (counter2 / array2.length));
	}
// 12.
	public static boolean willBuyDrink(boolean weather, double money) {
		return (weather && money > 10.5);
	}
//13.
	public static boolean willVikingsMakePlayoffs(boolean vikesOverLions, boolean titansOverRedskins, boolean texansOverEagles, boolean vikesOverBears) {

		if (!vikesOverLions) {
			return vikesOverLions;
		} else if (vikesOverLions && titansOverRedskins && texansOverEagles) {
			return true;
		} else if (vikesOverBears) {
			return true;
		} else {
			return false;
		}
	} 
}
