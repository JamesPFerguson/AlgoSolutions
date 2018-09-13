public class Kata
{

    static void Main(string[] args) {
        System.WriteLine(DontGiveMeFive(15, 100));
        System.WriteLine(DontGiveMeFive(20,340));
    }


 /* 
    Returns the number of numbers within a given range that do not include 5 in any place.
    @start is the starting number for the range
    @end is the ending number for the range
    @count is the number of numbers that do not include 5
 */
  public static int DontGiveMeFive(int start, int end)
  {

    int count = 0;
    for (int i = start; i <= end; i++) {
        if (!i.ToString().Contains("5")) {
           count++;
        }
    }
    return count;
  }
}