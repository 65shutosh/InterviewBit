public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
         int carry = 1;
        ArrayList<Integer> result = new ArrayList<>(a);
        int len = a.size();
        for (int i = len - 1; i >= 0; i--) {
            if (carry == 0) {
                // no need to check remaining digits
                break;
            }
            int digit = a.get(i);
            // plus 
            int num = digit + carry;
            if (num >= 10) {
                carry = num / 10;
                digit = num % 10;
            } else {
                carry = 0;
                digit = num;
            }
            result.set(i, digit);
        }
        
        if (carry != 0) {
            result.add(0, 1);
        }
       
        int index = 0;
        while (index < result.size() && result.get(index) == 0) {
            result.remove(index);
        }
        
        return result;
    }
        
}