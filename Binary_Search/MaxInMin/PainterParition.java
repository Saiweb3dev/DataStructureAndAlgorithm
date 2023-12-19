package Binary_Search.MaxInMin;
import java.util.*;
public class PainterParition {
  public static boolean canJobBeDone(ArrayList<Integer> boardLengths, int numPainters, int maxUnitsPerPainter)
    {
        int painterCount = 1;
        int unitsPainted = 0;
        for(int boardLength : boardLengths)
        {
            if(unitsPainted + boardLength <= maxUnitsPerPainter) unitsPainted += boardLength;
            else{
                painterCount++;
                unitsPainted = boardLength;
                if(painterCount > numPainters) return true;
            }
        }
        return false;
    }
  public static void main(String[] args) {
    System.out.println("Painter Partition");
    ArrayList<Integer> boardLengths = new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2,3));

     int numPainters = 2;

    int totalBoardLength = 0;
    int maxBoardLength = Integer.MIN_VALUE;
    for(int boardLength : boardLengths)
    {
        totalBoardLength += boardLength;
        maxBoardLength = Math.max(boardLength, maxBoardLength);
    }
    int left = maxBoardLength, right = totalBoardLength;
    while(left <= right)
    {
        int mid = (left + right) / 2;
        if(canJobBeDone(boardLengths, numPainters, mid)) left = mid + 1;
        else right = mid - 1;
    }
    System.out.println(left);
  }
}
