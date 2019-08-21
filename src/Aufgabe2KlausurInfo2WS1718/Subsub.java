package Aufgabe2KlausurInfo2WS1718;

public class Subsub extends Sub{

    public int subsubvar;
    
    public Subsub (){
        this(2);
        this.basisvar = 2;
        this.subsubvar = 222;
        System.out.println(this.subsubvar);
    }
    
    public Subsub(int x){
        this.subsubvar = x;
        System.out.println(this.subsubvar);
    }
}
