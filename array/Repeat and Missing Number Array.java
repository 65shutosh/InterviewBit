public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        List<Boolean> list = new ArrayList<Boolean>(Collections.nCopies(A.size(), false));
        int missing=0;
        int twoTimes=0;
        for(int i=0;i<A.size();i++){
            if(list.get(A.get(i)-1)==true)
                twoTimes=A.get(i);
            list.set(A.get(i)-1,true);
    }
    for(int i=0;i<list.size();i++){
        if(list.get(i)==false)
        missing=i+1;
    }
    ArrayList<Integer> l = new ArrayList<Integer>();
    l.add(twoTimes);
    l.add(missing);
    return l;
    }
}
