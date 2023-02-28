public class countingforloops {
    public static void main(String[] args)
    {
       //loop count up from 0 to 30 by 1
        for(int count = 0; count <= 30; count++)
        {
            System.out.printf("%3d" , count);

        }
        System.out.println();

        //loop count down from 30 to 0 by 1
        for(int cnt = 30; cnt >= 0; cnt--)
        {
        System.out.printf("%3d", cnt);
        }
        System.out.println();

        //	A loop that counts up by 3 from 0 to 18

      for(int cnt = 0; cnt <= 18; cnt += 3)
        {
            System.out.printf("%3d" ,cnt);
        }
        System.out.println();

        //A loop that counts down by 2 from 10 to 0
        for(int cnt = 10; cnt >= 0; cnt -= 2)
        {
            System.out.printf("%3d",cnt);
        }
        System.out.println();

    }




}