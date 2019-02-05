public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count =0;
         int  mindif=0;
        if(A.size()==B.size())
        {
            if(A.size()==1)
            return 0;
            else{   
                    int preX =A.get(0);
                    int preY =B.get(0);
                    for(int i=1;i<A.size();i++){
                        int x= A.get(i);
                        int y= B.get(i);
                            if(preY==y){
                                count=count+Math.abs(preX-x);
                            preX=x;
                            preY=y;
                                
                            }
                            else if(preX==x){
                                count=count+Math.abs(preY-y);
                            preX=x;
                            preY=y;
                                
                            }
                            else if(Math.abs(preY-y)==Math.abs(preX-x)){
                                count=count+Math.abs(preX-x);
                            preX=x;
                            preY=y;
                                
                            }
                            else{
                                if(Math.abs(preX-x)>Math.abs(preY-y)){
                                   mindif=Math.abs(preY-y);
                                    count=count+mindif;
                                    preY=y;
                                    if((preX-x)>(x-preX)){
                                        preX=preX-mindif;
                                    count=count+Math.abs(preX-x);
                                    }
                                    else{
                                        preX=preX+mindif;
                                        count=count+Math.abs(preX-x);
                                    }
                                    preX=x;
                                    }
                                else{
                                        mindif=Math.abs(preX-x);
                                    count=count+mindif;
                                    preX=x;
                                    if((preY-y)>(y-preY)){
                                        preY=preY-mindif;
                                    count=count+Math.abs(preY-y);
                                    }
                                    else{
                                        preY=preY+mindif;
                                        count=count+Math.abs(preY-y);
                                    }
                                    preY=y;
                                    }
                            }
                    }
                    return count;
                }
        }
       
       return 0;
        
    }
}
