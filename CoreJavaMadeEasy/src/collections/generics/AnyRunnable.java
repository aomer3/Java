package v.collections.generics;

//extends keyword will restrict the generic to a specific type
//Using & now requires that both the Thread and the Comparable interface be implemented 
public class AnyRunnable<T extends Thread&Comparable> {

}
