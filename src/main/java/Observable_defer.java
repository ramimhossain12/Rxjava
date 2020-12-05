import io.reactivex.Observable;

//Observable.defer() - Care for state changes?
public class Observable_defer {
    private  static  int start = 5,count=2;
    public static void main(String[] args) {

        Observable<Integer> observable = Observable.range(start,count);
        observable.subscribe(item-> System.out.println("Observer 1:" +item));
        count =3;
        observable.subscribe(item-> System.out.println("Observer 2 :" +item));
    }
}
