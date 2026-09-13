BUILDER PATTERN, Car builder.
Car builder is a builder pattern that can help you construct complex object like car, solving problem
with constructors with a massive list of parameters

In folder 'src' i contain all my classes and main.

First i created class Car that represents overall characteristics of any car that can be build. Characteristics like fields, getters and setters so that users can
set their own characteristics.
Then i created inteface CarBuilder that i implemented in my concrete builders.
CarDirector is a director of my concrete builders. This class cointains prepared in advance configurations of each concrete builder.
Concerete builders, DailyCar and SportCar each represent it's type of car, for example: Cars for daily usage that prioritize comfort, trunk capacity and so on.
Sport cars for races and drift.

I created it with IDE intelliJ IDEA (Akhtanov Aldiyar)
