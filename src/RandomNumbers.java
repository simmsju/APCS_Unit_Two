public class RandomNumbers {

    // create a static method called getRandom() that does not take any parameters and returns an int
    // between 0 and 37 inclusive.
    public static int getRandom() {
        int num = (int)(Math.random() * 38);
        return num;
    }

    public static void main(String[] args) {
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
    }


    // Write a main method that calls the getRandom() function five times and prints the result. Make sure to
    // uncomment the RandomNumbersTest when ready to test your code.
}
