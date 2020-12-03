import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.observables.ConnectableObservable;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        createibservaleUsingEmpty();
        createibservaleUsingNever();

    }

    private static void createibservaleUsingEmpty() {

        Observable observable = Observable.empty();
        observable.subscribe(System.out::println, System.out::println,()-> System.out.println("Commpleted"));

    }
  private  static  void createibservaleUsingNever() {
      Observable observable = Observable.never();
      observable.subscribe(System.out::println, System.out::println,()-> System.out.println("Commpleted"));
  }

}

