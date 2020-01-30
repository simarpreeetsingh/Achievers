import java.util.*;
public class Solution {
  public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
    if(A.size() == 1 && B.size() == 1)
      return 0;

    int i= 1;
    int steps= 0;
    while(i < A.size() && i < B.size())
    {
      steps= steps+ Math.max(Math.abs(A.get(i)-A.get(i-1)), Math.abs(B.get(i)-B.get(i-1)));
      i++;
    }

    return steps;
  }
}
