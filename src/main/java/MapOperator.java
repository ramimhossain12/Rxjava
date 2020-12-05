import io.reactivex.Observable;

public class MapOperator {
    public static void main(String[] args) {
      // mpoperator();
      //  mapoperatorReturnsDifferentData();
        filterOperator();
    }

    private  static  void mpoperator(){
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.map(item -> 2)
                .subscribe(System.out::println);
    }

    private  static  void mapoperatorReturnsDifferentData(){
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.map(item -> "Rxjava")
                .subscribe(System.out::println);
    }
    private  static  void      filterOperator(){
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.
                filter(item->item%2==0)
                .map(item-> item*2)
                .subscribe(System.out::println);
    }
}
