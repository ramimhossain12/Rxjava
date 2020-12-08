package Operator;

import io.reactivex.Observable;

public class doFinallyvsdoOnDispose {
    public static void main(String[] args) {

        exFinally();
        exDoOnDipose();
    }

    private static void exDoOnDipose() {

        Observable.just(1,2,3,4,5)

                .doOnDispose(()-> System.out.println("Ondispose : Dispose"))
                .doOnSubscribe(disposable -> disposable.dispose())
                .subscribe(System.out::println);
    }

    private static void exFinally() {
        Observable.just(1,2,3,4,50)
                .doFinally(()-> System.out.println("DoFinaly: compleet"))
                .subscribe(System.out::println);
    }
}
