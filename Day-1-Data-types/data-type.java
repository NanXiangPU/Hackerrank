public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int new_int = 0;
        double new_double = 0.0;
        String new_string = "";
        /* Read and save an integer, double, and String to your variables.*/
        new_int = Integer.parseInt(scan.nextLine());
        new_double = Double.parseDouble(scan.nextLine());
        new_string = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(new_int + i);
        /* Print the sum of the double variables on a new line. */
		System.out.println(new_double + d);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + new_string);

         scan.close();
    }
}