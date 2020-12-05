import io.reactivex.Observable;

public class ObservablefromCallable {

    public static void main(String[] args) {
        Observable<Integer> observable = Observable.fromCallable(()->{

            System.out.println("Calling method");

            return getNumber();


        });

        observable.subscribe(System.out::println,
                error-> System.out.println("An Exception occured "+ error.getLocalizedMessage()));
    }
    private  static  int getNumber(){
        System.out.println("Generating value");
        return  1/0;
    }
}
