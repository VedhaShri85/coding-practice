class Solution {
    int convertfive(int num) {
        int place=1;
        int res=0;
        // Your code here
        if(num==0) return 5;
        while(num>0){
            int d= num%10;
            if(d==0){
                d=5;
            }
            
                 res=d*place+res;
                place*=10;
                num/=10;
            
        }
        return res;
    }
}
