package Operator;

import io.reactivex.Observable;

public class flatMap {

    public static void main(String[] args) {
        exFlatMap();
        exFlatMapBitFunction();
    }

    private static void exFlatMap() {
        Observable<String> observable = Observable.just("foo","bar","jam");

        observable.flatMap((string)-> {
            if (string == "foo") return  Observable.empty();
            return Observable.fromArray(string.split(""));
        })
                .subscribe(System.out::println);
    }

    private  static  void   exFlatMapBitFunction(){
        Observable<String> observable = Observable.just("foo","bar","jam");
        
    }
}
