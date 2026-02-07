package src.main.java.org.example.singletonpattern;

/*
Each pattern has it own advantage and disadvantage.

In Eager Initialization even though the object not required in few cases it will create object in memory, if the
object size is small it has less impact or else in no use scenario creating huge object will be problem.

In Lazy Initialization even though the object is created based on the need if we trigger the call to the getInstance
method in parallel it will break the pattern.

In Synchronized pattern to overcome the above issue of multiple call to the getInstance method in parallel
synchronized method is used but it will internally lock and unlock the method for each thread at a time which
will lead to performance degradation.

To avoid the performance degradation we have the double lock check in that instead of using the synchronized method
we can use the synchronized keyword during the object creation.

Note - due to memory issue in this case we need to assign the instance object variable as volatile

 */


public class SingletonMain {

    public static void main(String[] args) {

        System.out.println("-".repeat(20) + " Eager Initialization " + "-".repeat(20));

        EagerInitialization eagerInitialization = EagerInitialization.getInstance();
        System.out.println(eagerInitialization.hashCode());

        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
        System.out.println(eagerInitialization2.hashCode());

        System.out.println("-".repeat(20) + " Lazy Initialization " + "-".repeat(20));

        LazyInitialization lazyInitialization = LazyInitialization.getInstance();
        System.out.println(lazyInitialization.hashCode());

        LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();
        System.out.println(lazyInitialization2.hashCode());

        System.out.println("-".repeat(20) + " Synchronized Method " + "-".repeat(20));

        SynchronizedInitialization synchronizedInitialization = SynchronizedInitialization.getInstance();
        System.out.println(synchronizedInitialization.hashCode());

        SynchronizedInitialization synchronizedInitialization2 = SynchronizedInitialization.getInstance();
        System.out.println(synchronizedInitialization2.hashCode());

        System.out.println("-".repeat(20) + " Double Lock Check " + "-".repeat(20));

        DoubleLockCheck doubleLockCheck = DoubleLockCheck.getInstance();
        System.out.println(doubleLockCheck.hashCode());

        DoubleLockCheck doubleLockCheck1 = DoubleLockCheck.getInstance();
        System.out.println(doubleLockCheck1.hashCode());

        DoubleLockCheck doubleLockCheck2 = DoubleLockCheck.getInstance();
        System.out.println(doubleLockCheck2.hashCode());

        System.out.println("-".repeat(20) + " Bill Pugh " + "-".repeat(20));

        BillPugh billPugh = BillPugh.getInstance();
        System.out.println(billPugh.hashCode());

        BillPugh billPugh2 = BillPugh.getInstance();
        System.out.println(billPugh2.hashCode());

    }

}
