package Operator;

import io.reactivex.Observable;

public class Distinct_and_distinctUtilChanged {

    public static void main(String[] args) {
        //disintctOperator();
       // disinctWithKeySelector();
       // distinctUntilChangedIperator();
     disintUntilChnagedWithKeyStore();
    }




    private static void disintctOperator() {
        Observable.just(1,1,2,2,3,3,4,5,2)
                .distinct()
                .subscribe(System.out::println);


    }
    private static void disinctWithKeySelector() {
        Observable.just("foo","fool","super","foss","foil").distinct(item-> item.length())
                .subscribe(System.out::println);
    }
    private static void distinctUntilChangedIperator() {

           Observable.just(1,1,2,2,3,3,4,4,5,5)
                   .distinctUntilChanged()
                   .subscribe(System.out::println);
    }

    private static void disintUntilChnagedWithKeyStore() {

        Observable.just("foo","fool","super","foss","foil")
                .distinctUntilChanged(String::length)
                .subscribe(System.out::println);
    }

}
