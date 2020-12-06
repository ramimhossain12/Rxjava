import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

//take(),  takeWhile(), skip(),skipWhile()
public class Operators {

    public static void main(String[] args) {

       // takeOperator();
       // takeWhile();
       // takeWhileInterval();
       // skipOperator();
        skipwhileOperator();
    }

    private  static  void takeOperator(){
        Observable.just(1,2,3,4,5)
                .take(3)
                .subscribe(System.out::println);
    }

    private static void  takeWhileInterval(){
        Observable.interval(300, TimeUnit.MILLISECONDS)
                .subscribe(System.out::println,System.out::println, ()-> System.out.println("Completed"));
            pause(5000);

    }

    private static  void  takeWhile(){
        Observable.just(1,2,3,4,5,1,2,3,4,5)
                .filter(item-> item<=3)
                .subscribe(System.out::println);
    }


     private  static  void  skipOperator(){

        Observable.just(1,2,3,4,5)
                .skip(2)
                .subscribe(System.out::println);
     }


     private  static  void  skipwhileOperator(){

         Observable.just(1,2,3,4,5, 1,2,3,4,5)
                 .skipWhile(item-> item<=3)
                 .subscribe(System.out::println);
     }


    private static void pause(int i) {

        try {
          sleep(i);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
