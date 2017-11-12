package br.com.kyxadious;

import br.com.kyxadious.chapter.five.Chapter5;
import br.com.kyxadious.chapter.four.Chapter4;
import br.com.kyxadious.chapter.three.Chapter3;
import br.com.kyxadious.chapter.two.Chapter2;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Chapter 2:");
        //new Chapter2().exampleForEach();

        //System.out.println("Chapter 3:");
        //new Chapter3().exampleThreadRunnable();
        //new Chapter3().exampleValidatorCEP();
        //new Chapter3().exampleWhoAmILambda();
        //new Chapter3().exampleLocalVariableFinal();
        //new Chapter3().exampleLocalVariableNonFinal();

        //System.out.println("Chapter 4:");
        //new Chapter4().examplePredicate();
        //new Chapter4().examplePredicateLambda();

        System.out.println("Chapter 5:");
        //new Chapter5().exampleComparator();
        //new Chapter5().exampleComparatorLambda1();
        new Chapter5().exampleComparatorLambda2();
    }
}
