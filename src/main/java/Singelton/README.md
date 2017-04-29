

<b>Singleton using double locking:</b>
<pre>

   public static MyObject getInstance() {
       if ( instance == null ) {
            synchronize(MyObject.class) {
                 if ( instance == null ) {
                    instance = new MyObject();
                 }
            }
       }
       return instance;
   }

</pre>

From: https://dzone.com/articles/singleton-design-pattern-%E2%80%93<br>
<pre>
In such situation the may be three or more threads are waiting on the synchronized block to get access.

Since we have used synchronized only one thread will be given access.

All the remaining threads which were waiting on the synchronized block will be given access when first thread exits this block.

However when the remaining concurrent thread enters the synchronized block they are prevented to enter further due to the double check : null check.

Since the first thread has already created an instance no other thread will enter this loop.

All the remaining threads that were not lucky to enter the synchronized block along with the first thread will be blocked at the first null check.

This mechanism is called double checked locking and it provides significant performance benefit and also it is cost effective solution.
</pre>

<br><br>

<b>Singleton using enum</b>
<pre>
Enum is thread safe and implementation of Singleton through Enum ensures that,
 your singleton will have only one instance even in a multithreaded environment.
</pre>

<br>

Notes:<br>

Singleton object stores in Heap but, static object stores in stack.<br>


