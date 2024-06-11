public class Main {
    public static void main(String[] args) {
        //DSA Array
        /*
        * 1.Create a variable minValue and set it equal to the first element in the array
        * 2.Go to every element in the array
        * 3.If the current element has a lower value than 'minVal', update 'minVal' to this value.
        * 4.After looking at all the elements in the array, the 'minVal' variable now contains the lowest value
        * */

        int[] intArray = {3,6,2,8,9,3,5,2,1};
        int minValue = intArray[0];

        //index starts from the zero element
        //i can't be bigger than the Array length
        //index grows by 1
        for (int i = intArray[0]; i < intArray.length; i++){
        //if the intArray value isa smaller than the value of the variable of minValue
            if (intArray[i] < minValue)
            {
                minValue = intArray[i];
            }
        }
        System.out.println("Lowest value is: " + minValue);

    }
}