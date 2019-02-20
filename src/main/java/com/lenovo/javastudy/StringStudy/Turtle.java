package StringStudy;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Formatter类
 *
 * Created by liuyu on 16/3/5.
 */
public class Turtle {

    private String name;

    private Formatter f;

    public Turtle(String name, Formatter f){
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y){
        f.format("%s The Turtle is at(%d %d)\n",name,x,y);
    }

    public static void main(String[] args){
        PrintStream outAlias = System.out;
        PrintStream errAlias = System.err;
        Turtle tommy = new Turtle("Tommy",new Formatter(System.out));
        Turtle terry = new Turtle("Terry",new Formatter(outAlias));
        Turtle ammy = new Turtle("Ammy",new Formatter(errAlias));

        tommy.move(3,5);
        terry.move(4,8);
        ammy.move(6,3);
    }
}
