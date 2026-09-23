class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : asteroids){
            while(!list.isEmpty() && list.get(list.size()- 1)> 0 && a < 0){
                int top = list.get(list.size()-1);
                if(top < - a){
                    list.remove(list.size() -1 );
                }
                else if (top == -a ){
                    list.remove(list.size() -1);
                    a= 0;
                    break;
                }
                else{
                    a= 0;
                    break;
                }
            }
            if(a != 0){
                list.add(a);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}