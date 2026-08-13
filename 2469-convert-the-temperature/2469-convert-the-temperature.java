class Solution {
    public double[] convertTemperature(double celsius) {
       double k=celsius+273.15,f=celsius*1.80+32.00;
       double[] s=new double[2];
       s[0]=k;
       s[1]=f;
       return s; 
    }
}