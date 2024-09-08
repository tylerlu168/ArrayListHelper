import java.util.ArrayList;

public class Driver
{
    public static void main(String[] args)
    {
        ArrayList<String> countries = new ArrayList<String>();

        countries.add("'merca");
        countries.add("Chad");
        countries.add("Djibouti");

        System.out.println(countries);


        ArrayListHelper.fill(countries, "North Korea");

        System.out.println(countries);

        System.out.println(ArrayListHelper.count(countries, "Chad"));

        ArrayListHelper.removeAll(countries, "North Korea");

        System.out.println(countries);
    }
}
