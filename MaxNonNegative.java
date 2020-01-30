public class Solution {
  public ArrayList<Integer> maxset(ArrayList<Integer> A) {
    if((A.size() == 1 && A.get(0) >= 0) || (A == null || A.size() == 0))
      return A;
    int start= 0;
    int end= 0;
    int flag= 0;
    int i= 0;
    long curr= 0;
    int len= 0;
    long max= (long)A.get(0);
    ArrayList<Integer> sum= new ArrayList<Integer>();
    while(i < A.size())
    {
      if(A.get(i) < 0)
      {
        len= 0;
        i++;
        flag= i;
        curr= 0;
        continue;
      }
      curr= curr + A.get(i);
      if(curr > max)
      {
        max= curr;
        start= flag;
        end= i++;
        len= end - start;
        continue;
      }
      if(curr == max && len < i-flag)
      {
        max= curr;
        start= flag;
        end= i++;
        continue;
      }
      if(curr == max && len == i-flag)
      {
        i++;
        continue;
      }
      i++;
    }

    if(start == 0 && end == 0)
    {
      if(max >= 0)
        sum.add(A.get(0));
      return sum;
    }

    for(int k= start; k<=end; k++)
      sum.add(A.get(k));
    return sum;
  }
}
