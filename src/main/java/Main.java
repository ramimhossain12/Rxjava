import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.observables.ConnectableObservable;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //createColdObservable();
        createHotAndConnectableObservable();
    }

     private  static  void  createColdObservable(){
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.subscribe(item -> System.out.println("observer 1: "+item));


         observable.subscribe(item -> System.out.println("observer 2: "+item));
     }

     private  static  void  createHotAndConnectableObservable(){
         ConnectableObservable<Integer> observable = Observable.just(1,2,3,4,5).publish();

         observable.subscribe(item -> System.out.println("observer 1: "+item));
         observable.subscribe(item -> System.out.println("observer 2: "+item));
         observable.connect();
     }



}

