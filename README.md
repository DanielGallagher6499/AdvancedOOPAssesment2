# AdvancedOOPAssesment2
You are required to provide a redesign and refactoring of the classes above that eliminates
redundancy and duplication, provides maximum reusability, extensibility and satisfies the
following additional requirements:

- A Client class should be able to iterate over all instances of Beta, Epsilon, Zeta and
Gamma in the system and update their state in a uniform way. The Client class
should also create instances of the main objects in your design and call their key
methods. Ideally, the class Client should not need to know about any of the add/remove
or iterator methods in Delta or Alpha.

- Instances of the class Beta or any of its subtypes should never be stored by Alpha, but
the class Delta should exist as a singleton. Possible subtypes of Beta are limited to the
classes Eta, Theta, Iota and Kappa, all of which implement an additional method that
takes in a byte and returns a byte. In addition, a range of other restrictions could
potentially be applied to control access to Delta from Beta.

You are free to change any of the classes in any way you wish, including renaming, changing
method signatures and deriving new types. Any new classes or class names should be taken
from the set {Eta, Theta, Iota, Kappa, Lambda, Omicron, Sigma, Omega}. You must
implement your design as a set of Java classes and document your rationale in no more than
300 words in a README file and a UML class diagram. You should also document your
rationale for the design of each class in JavaDoc comments after the package statement.
