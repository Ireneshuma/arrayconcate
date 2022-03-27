public class arrays {
    public static void main( String[] args){
        int [] numbers = new int[10];
        int i = numbers.length;


        for(i = 9; i <=numbers.length ; i--) {

            numbers[i] = i-1;

            System.out.println(numbers[i]);
        }




    }

}
