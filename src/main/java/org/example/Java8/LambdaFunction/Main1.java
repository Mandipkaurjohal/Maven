package org.example.LambdaFunction;

public class Main1 {
    public static void main(String[] args) {
        Utility1 utility1=new Utility1();
        utility1.validator(i->i%45==0 ,10);
    }


}
