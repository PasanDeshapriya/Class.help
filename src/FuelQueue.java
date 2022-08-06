import java.util.Scanner;

public class FuelQueue {
    private Passanger passanger1;
    private Passanger passanger2;
    private Passanger passanger3;
    private Passanger passanger4;
    private Passanger passanger5;
    FuelQueue(){
        this.passanger1=new Passanger();
        this.passanger2=new Passanger();
        this.passanger3=new Passanger();
        this.passanger4=new Passanger();
        this.passanger5=new Passanger();
    }

    public Passanger passanger1(){
        return this.passanger1;
    }


}



