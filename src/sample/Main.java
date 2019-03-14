package sample;
import sample.View;


public class Main {



    public static void main(String[] args) {


            try {
                View myView= new View();
                myView.launch(View.class,args);

            } catch(Exception e) {
            e.printStackTrace();
        }

    }
}