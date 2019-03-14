package sample.logic.Functors;

import sample.logic.Interface;

public class Adder implements Interface {

    //  public static int getRand(int Max){
    //     Random r = new Random();
    //     return r.nextInt(Max);
    //  }
    public int doSomething(int heightValue,int lowValue){

        return heightValue+lowValue;


    }
    public Adder(){}




}
