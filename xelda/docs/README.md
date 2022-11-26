## LDTS-L16G04  <XELDA>

This game is inspired by the old style Zelda games with our own twist.

The main character gets lost in a castle and wants to find a way out but in his path he finds some troublesome monsters trying to capture him. The main character only has two options, run away or fight.

This project was developed by Bruno Pinheiro (up201705562@fe.up.pt), Eduardo Machado (up202105337@fe.up.pt) and Henrique Silva (up202105647@fe.up.pt) for LDTS 2022/2023.


### IMPLEMENTED FEATURES

- **Movement** - The game character will move around whenever the following keys are pressed (arrow-up, arrow-left, arrow-down, arrow-right).

### PLANNED FEATURES

The following features are still **not implemented** :
- **Shop** - A place where coins can be traded for potions.
- **Potions** - Only accessible by the shop, can be bought with coins. Potions examples: Health, speed, etc...
- **Combat** - The combat mechanics implemented will be : odd or even, rock paper scissors.
- **Mobs** - In every room there will be different kind of mobs, ready to attack you.
- **Changing rooms** - Inside the castle our hero is capable of progressing in his journey by exploring multiple rooms (tower, dungeon, hall, etc..)
- **Inventory** - Shows the items that can be used by the hero.
- **Menu** - Interface (start game,save - saving stage of the game,coins,items -> in a text file).
- **Getting coins** - When the character steps on coin, the number of coins is incremented.


- With all these features implemented, the UML diagram should look like this:

<img height="600" src="/Users/henrique/Desktop/Captura de ecrã 2022-11-25, às 23.41.42.png" width="1000"/>

### DESIGN

### Architectural Pattern

**Problem in Context.**

The architecture of the project is one of the most important parts of the project. Choosing the right approach is essential.

**The Pattern.**

To solve this problem, we implemented the MVC (model-view-controller) design pattern.

**Implementation.**
- Model - Represents the data.
- View - Displays the model data, and sends user actions (user inputs, such as pressing the keyboard) to the controller.
- Controller - Provides model data to the view, and processes user actions (user inputs, such as pressing the keyboard).


**Consequences.**
- Modifications do not affect the entire model.
- Easy planning and maintenance.

------

### TESTING

#### Coverage Report

<img height="400" src="/Users/henrique/Desktop/Captura de ecrã 2022-11-25, às 22.44.35.png" width="1000"/>

#### Mutation Testing Report

<img height="600" src="/Users/henrique/Desktop/Captura de ecrã 2022-11-25, às 22.13.36.png" width="1000"/>

### SELF-EVALUATION

- Bruno Pinheiro (up201705562): 34%
- Eduardo Machado (up202105337): 33%
- Henrique Silva (up202105647): 33%