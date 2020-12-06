package Operator;

import io.reactivex.Observable;

public class DefaultEmptyAND_SwitchEmpty {
    public static void main(String[] args) {

        //useDefaultEmpty();
        useSwitchIFEmpty();
    }

    private static void useDefaultEmpty() {
        Observable.just(1,2,3,4,5)
                .filter(item->item>10)
                .defaultIfEmpty(100)
                .subscribe(System.out::println);
    }

    private static void useSwitchIFEmpty() {
        Observable.just(1,2,3,4,5)
                .filter(item->item>10)
                .switchIfEmpty( Observable.just(-6,7,8,9,10))
                .subscribe(System.out::println);
    }
}
