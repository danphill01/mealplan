# Menuplan

## Background
This project is a combination of two ideas from the weekly project club. Since much of the needed software infrastructure would be common to both, the common code is provided here.

### Idea 1

Tanya is the manager of her school system’s cafeterias.  Every month she needs to come up with school lunches for the next month.  The school lunches should have a variety of different mains, sides, and desserts.

Write Tanya a program that will put together her lunches for her.  
Come up with a list of mains, sides, and desserts
Be able to generate a list of meals.
The meals should be unique.

If you want to take it to the next level, calculate the calories and other nutritional values for the meals and generate balanced meals.

### Idea 2

Parker works a day job and when he comes home in the evening he likes to cook for himself.  The only problem is, he never has ingredients on hand.  He needs something to help him plan out his meals for the week

Make Parker a shopping list generator.  Parker would like to be able to:
Enter the names of recipes
Enter the ingredients of a recipe
Be able to pick from a list of recipes what meals to have this week
Print out a shopping list with all the ingredients he needs.

If you want to go the extra mile:
Keep track of what he has on hand.
Keep track of sides and suggest meals + sides that fit with the shopping list
Integrate with an internet grocery ordering service and place the order automatically.

## Setup Instructions

### Prerequisites

Postgres - Run from a docker container using compose or from a server on port 5432 with a database named "menuplan" created.
Maven - Run backend server from an IDE such as IntelliJ by running the springboot plugin or from the command line. e.g. `mvn package && java -jar target\menuplan-0.0.1-SNAPSHOT.jar`

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 8.3.6.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
