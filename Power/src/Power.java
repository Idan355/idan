public class Power {

    public static int power(int n1, int n2){
      if (n2==0)
          return 1;
      else
          return power(n1,n2-1)*n1;

    }
}
