package sample.logic.Functors;

import sample.logic.Interface;

import java.util.Random;
public class Randomizer implements Interface {

    //  public static int getRand(int Max){
    //     Random r = new Random();
    //     return r.nextInt(Max);
    //  }
    public int doSomething(int heightValue,int lowValue){
        if(heightValue<lowValue){
            int temp=heightValue;
            heightValue=lowValue;
            lowValue=temp;
        }
        Random r = new Random();
        return r.nextInt(heightValue-lowValue)+lowValue;


    }

    public Randomizer(){

    }



}