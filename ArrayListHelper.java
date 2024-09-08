import java.util.ArrayList;

public class ArrayListHelper
{
    public static void fill(ArrayList<String> list, String str)
    {
        for (int i = 0; i < list.size(); i++)
        {
            list.set(i, str);
        }
    }

    /**
     *
     * @param list
     * @return the String with the shortest length in list
     */
    public static String min(ArrayList<String> list)
    {
        String min = list.get(0);

        for (String str : list)
        {
            if(str.length() < min.length())
            {
                min = str;
            }
        }
        return min;
    }

    /**
     *
     * @param list
     * @param str
     * @return the number of time str occurs in list
     */
    public static int count(ArrayList<String> list, String str)
    {
        int count = 0;

        for(String e : list)
        {
            if(e.equals(str))
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Remove all occurences of str from list.
     * @param list
     * @param str
     */
    public static void removeAll(ArrayList<String> list, String str)
    {
        for (int i = list.size()-1; i >= 0; i--)
        {
            if(list.get(i).equals(str))
            {
                list.remove(i);
            }
        }
    }
}
