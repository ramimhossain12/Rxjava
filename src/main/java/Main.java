import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.observables.ConnectableObservable;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
      //  throwException();
        throwExceptionUsingCallable();
    }

    private static void throwException() {
        Observable obs = Observable.error(new Exception("An Exception"));
        obs.subscribe(System.out::println, error -> System.out.println("Error 1:" + error.hashCode()));
        obs.subscribe(System.out::println, error -> System.out.println("Error 2:" + error.hashCode()));

    }
  private  static  void throwExceptionUsingCallable(){
      Observable obs = Observable.error(() -> new Exception("An Exception"));
      obs.subscribe(System.out::println, error -> System.out.println("Error 1:" + error.hashCode()));
      obs.subscribe(System.out::println, error -> System.out.println("Error 2:" + error.hashCode()));
  }

}

