# ooad
Head-first object oriented analysis and design

## Strategy Pattern
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

## Observer Pattern
**The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.**

## Decorator Pattern

The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

**Classes should be open
for extension, but closed for modification.**

## Factory Method Pattern

Instantiation is an activity that shouldn’t always be done in public and can often lead to coupling problems.

The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

## Abstract Factory Pattern Method

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## Command Pattern

The Command Pattern allows you to decouple the requester of an action from the object that actually performs the action. So, here the requester would be the remote control and the object that performs the action would be an instance of one of your vendor classes.

The Command Pattern encapsulates a request (LightOn, GarageOpen) as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

## Adapter and Facade Pattern
A facade not only simplifies an interface, it decouples a client
from a subsystem of components.
Facades and adapters may wrap multiple
classes, but a facade’s intent is to simplify, while
an adapter’s is to convert the interface to something different.

## Template method pattern

The Template Method defines the steps of an algorithm and allows subclasses to provide the implementation for one or more steps.




