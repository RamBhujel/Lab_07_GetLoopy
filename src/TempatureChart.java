public class TempatureChart {
    public static void main(String[] args)
    {
        double fVal = 0.0;
        double cVal = 0.0;

        System.out.println("Celsius \tFahrenheit");
        for(cVal = 0.0; cVal <= 100; cVal += 1)
        {
            fVal = (cVal * 1.8) + 32;

            System.out.printf("%5.2f %12.2f\n", cVal,fVal );
        }

    }
}
