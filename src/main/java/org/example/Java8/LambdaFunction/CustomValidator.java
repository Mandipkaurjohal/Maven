package org.example.LambdaFunction;

public class CustomValidator implements IValidate{
    @Override
    public boolean validate(Integer i) {
        return i%45==0;
    }
}
