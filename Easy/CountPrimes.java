/*
Count the number of prime numbers less than a non-negative number, n.

*/



class Solution {
    public int countPrimes(int n) {
        
        if (n==0) {
            return 0; 
        }
        
        boolean[] flags = new boolean[n];
        
        for (int i=0;i<flags.length;i++) {
            flags[i] = true; 
        }
        int prime = 2;
        
        while (prime <= Math.sqrt(n)) {
            crossOff(flags,prime);
            prime = getNextPrime(flags,prime);
        }
            
        int count = 0;
        for (int i = 2; i<flags.length; i++) {
            if (flags[i] == true) {
                count++;
            }
        }
        
        return count; 
              
    }
               
    public void crossOff(boolean[] flags, int prime) {
        for (int i = prime*prime;i<flags.length;i+=prime) {
            flags[i] = false;
        }
    }
               
    public int getNextPrime(boolean[] flags, int prime) {
        int next = prime+1;
        
        while (next<flags.length && !flags[next]) {
            next++;
        }
        return next; 
     }
}