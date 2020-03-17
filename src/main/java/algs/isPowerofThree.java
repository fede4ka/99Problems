package algs;

public class isPowerofThree {
    public static boolean stepen (int n) {

        if(n==0)
            return false;

        if(n==1)
            return true;

        if(n>1)
            return n%3==0 && stepen(n/3);
        else
            return false;

    }

}
