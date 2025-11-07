package org.example.LambdaFunction;

public class Main {
    public static void main(String[] args) {
//        Validate validate=new Validate();
//        System.out.println(validate.validator(15));
Utility utility= new Utility();
CustomValidator validator=new CustomValidator();
// IValidate iValidate=  i-> i%45==0;



utility.validator( i-> i%45==0,35);
    }
        }


