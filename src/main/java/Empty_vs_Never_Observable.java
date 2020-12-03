import io.reactivex.Observable;

public class Empty_vs_Never_Observable {



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



