package Operator;

import io.reactivex.Observable;

public class Operators_Contains {
    public static void main(String[] args) {
        containsWithPremitive();
        //containsWithNonPremitive();
    }

    class User{
        String  name;

        public User(String name) {
            this.name = name;
        }
    }



//    private static void containsWithNonPremitive() {
//
//        User user = new User("ramim");
//        Observable.just(user)
//                .contains(new User["ramim"])
//                .subscribe(System.out::println);
//
//
//    }

    private static void containsWithPremitive() {
        Observable.just(1,2,3,4,5)
                .contains(4)
                .subscribe(System.out::println);
    }
}
