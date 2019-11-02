public class BookMission3 {

    public static void print(int n){
        if(n>0){
            System.out.println(n);
            print(n-1);

        }
    }

}
