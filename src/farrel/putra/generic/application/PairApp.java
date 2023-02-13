package farrel.putra.generic.application;

import farrel.putra.generic.Pair;

public class PairApp {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String, Integer>("Farrel", 100);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
