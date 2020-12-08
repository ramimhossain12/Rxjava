package Operator;

import io.reactivex.Observable;

import java.util.Comparator;

public class OperratorSort {
    public static void main(String[] args) {


       // useSorted();
       // useSortedWithOwnComparator();
        useSortOnNonComparator();
    }

    private static void useSortOnNonComparator() {
        Observable.just("foo","john","bar")
                .sorted((first,second)-> Integer.compare(first.length(),second.length()))
                .subscribe(System.out::println);
    }

    private  static  void useSorted(){
        Observable.just(3,5,2,4,1)
                .sorted()
                .subscribe(System.out::println);


    }
    private  static  void  useSortedWithOwnComparator(){
        Observable.just(3,5,2,4,1)
                .sorted(Comparator.reverseOrder())
                .subscribe(System.out::println);
    }
}

