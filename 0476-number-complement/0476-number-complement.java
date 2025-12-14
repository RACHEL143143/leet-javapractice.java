class Solution {
    public int findComplement(int num) {
        if(num==0)return 1;
        int bin=Integer.toBinaryString(num).length();
        int ones=(1<<bin)-1;
        return num^ones;
    }
}