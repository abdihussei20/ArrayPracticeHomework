import java.util.*;
public class ArrayPractice {
	public static void main(String[] Args) {
		 
int [] my_Arr = {4,6,8,9,7};
		
		int sum = 0;
		
		for(int i=0; i<my_Arr.length; i++) {
			sum += my_Arr[i];
		}
		System.out.printf("The sum of the array is %d \n", sum);
		
		double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }

        }

        System.out.println(index);
      
      
        
        System.out.printf((Arrays.toString(toPower(12,2))));
       
       
	
	}
	/**create a method, not using void because we want it to
	 return an array, hence why we used (int[]) in the method
	 name.
	 */
	public static int[] toPower(int size, int power) {
	//create a new array to store size since we have to return an array of "size"	//
		 int[] tp_Arr = new int[size];
	//Iterate through each value in the created array which holds our size variable//	 
		 for(int i =0; i <size; i++) {
			/** Using int because makes sure the a number is returned rather than (number^2)
			 * Math.pow(a,b) function for setting a variable to the power of, where a is the base
			 and b is the exponent. In this case, i is the base because it goes through each value in size 
			  and power is our exponent
			 *Encapsulated the function in parenthesis b/c want to return result as a integer.
			 */
			tp_Arr[i]= (int)(Math.pow(i, power));
		 }	
		 return tp_Arr;
	}
}

	
