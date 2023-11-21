public class Beer{
    public static void main(String[] args){
        int sum=0;
        for(int i=99;i>=2;i--){
            sum=i-1;
            System.out.println(i+ " bottles of beer on the wall, "+i+ " bottles of beer" );
            System.out.println("Take one down and pass it around, "+sum+ " bottles of beer on the wall \n ");
        }
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
        System.out.println("Take one down and pass it around, no more bottles of beer on the wall\n");
        System.out.println("No more bottles of beer on the wall, no more bottles of beer");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall\n");
    }
}