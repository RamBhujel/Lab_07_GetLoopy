public class nestedforloops {
    public static void main(String[] args) {
        //nested loop from 1 star to 5 star

       /* for (int cnt = 1; cnt <= 5; cnt++)
        {
            for (int star = 1; star <= cnt; star++) {
                System.out.print("*");
            }
            System.out.println();


        }

        //nested loop from 5 star to 1 star

        for(int cnt = 5; cnt >= 1; cnt--)
        {
        for(int star = 1; star <= cnt; star++)
        {
            System.out.printf("*");
        }
            System.out.println();
        }*/

        //nested loop 5 star 5 times
      for(int cnt = 1; cnt <= 5; cnt++)
        {
            for(int star = 1; star <= 5; star++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }

}
}
