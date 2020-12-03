import io.reactivex.Observable;

public class TheReactive_Loop {

    public static void main(String[] args) {

        Observable<Integer> observable = Observable.range(0,5);
        observable.subscribe(System.out::println);

        int start = 0;
        int count = 3;

        Observable<Integer> observabl = Observable.range(start,count);
       observabl.subscribe(System.out::println);

    }
}
