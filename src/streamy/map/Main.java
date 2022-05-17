package streamy.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//stream = pohlad -> vytvori sa prud funkcii, ktore nam ponukaju rozne moznosti

public class Main {

    public static void main(String[] args)
    {
        /*List<Integer> cisla = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<50;++i)
        {
            cisla.add(r.nextInt(100));
        }
        for(Integer i:cisla)
        {
            System.out.print(i+" ");
        }

        System.out.println();
        cisla.stream().sorted().forEach(i-> System.out.print(i+" "));
        System.out.println();
        cisla.stream().sorted().filter((i->i%2==0)).filter(i->i>50).forEach(i-> System.out.print(i+" "));*/

        String veta1 = "Toto je nasa pokusna veta, na ktorej si budedme trenovat streamove operacie!";
        List<Character> veta = new ArrayList<Character>();
        for(char i:veta1.toCharArray())
        {
            veta.add(i);
        }
        System.out.println(veta.stream().filter(i->"aeiouyAEIOUY".indexOf(i)!=-1).count());
    }
}
