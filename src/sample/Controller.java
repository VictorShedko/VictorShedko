package sample;
import sample.logic.Interface;
import sample.logic.Functors.*;

import java.util.*;

public class Controller {

    Map<String,Interface> mymap=new HashMap<String, Interface>();

    Controller(){
        Randomizer randomaizerObject=new Randomizer();
        Subtractor subtractorObject=new Subtractor();
        Adder adderObject=new Adder();
        this.mymap.put("add",adderObject);
        this.mymap.put("sub",subtractorObject);
        this.mymap.put("random",randomaizerObject);

    }
    public Interface getObectToDo(String inputString){

        return mymap.get(inputString);

    }
    public int analyze(String inputMessege,Integer a,Integer b){


        Interface objectToDo= mymap.get(inputMessege);
        return objectToDo.doSomething(a,b);

    }




}
