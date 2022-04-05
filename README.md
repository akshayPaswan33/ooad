# ooad
Head-first object oriented analysis and design

##Strategy Pattern
Design Principle

**Identify the aspects of your application that vary and separate
them from what stays the same.
Take what varies and “encapsulate” it so it
won’t affect the rest of your code.**

We know that fly() and quack() are the parts of the Duck class that vary across ducks.
To separate these behaviors from the Duck class, we’ll pull both methods out of the Duck class and create a new set of classes to represent each behavior.

**Program to an interface, not an implementation.**

From now on, the Duck behaviors will live in a separate class—a class that implements a particular behavior interface. That way, the Duck classes won’t need
to know any of the implementation details for their own behaviors.

**Favor composition over inheritance.**

##Observer Pattern
**The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.**

