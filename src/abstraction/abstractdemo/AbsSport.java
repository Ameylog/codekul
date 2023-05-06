package abstraction.abstractdemo;

/**
 *         abstract                                                            interface
 *
 * 1.abstract keyword is used to declared abstract class                    1. interface
 *
 * 2.you can declare private,protected,public,default methods               2.only public
 *
 * 3.declared and concrete(define) methods are allowed                      3.only declared
 *
 * 4. partially abstraction                                                 4.100% abstraction
 *
 *
 */

public abstract class AbsSport{       // abstract keyword mandatory

    protected abstract void show(); /// method declared  ///incomplete method

    public void gym(){                      /// define method  /// complete method // concrete method
        System.out.println("In gym");

    }
}

