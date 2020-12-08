package Operator;

import io.reactivex.Observable;

public class DO_Action {

    public static void main(String[] args) {

        //exDoOnSubscribe();
       // exDoNext();
        exDoOnCompleet();
    }

    private static void exDoOnCompleet() {
        Observable.just(1,2,3,4,5)
                .doOnComplete(() -> System.out.println("doOnCompleet: complteet"))
                .subscribe(System.out::println);
    }

    private static void exDoNext() {
        Observable.just(1,2,3,4,5)
                .doOnNext(item-> System.out.println("doOnNext :" +  item))
                .subscribe(System.out::println);
    }

    private static void exDoOnSubscribe() {
        Observable.just(1,2,3,4,5)
                .doOnSubscribe(disposable -> System.out.println("doOnSubscribe:subscribe"))
                .subscribe(System.out::println);
    }
}
