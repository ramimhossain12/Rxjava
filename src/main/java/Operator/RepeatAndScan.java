package Operator;

import io.reactivex.Observable;

public class RepeatAndScan {
    public static void main(String[] args) {
       //  repeatOperator();
         scanOperrator();

        //System.out.println("The Scan Operator :");
    }


    private static void repeatOperator() {

        Observable.just(1,2,3,4,5)
                .repeat(2)
                .subscribe(System.out::println);


    }

    private static void scanOperrator() {
        Observable.just(1,2,3,4,5)
                .scan((accumukator,next) ->accumukator +next)
                .subscribe(System.out::println);

    }


}
