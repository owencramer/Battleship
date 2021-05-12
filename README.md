# Battleship


### Get Started with the game:
- Download the game [here](https://github.com/owencramer/Battleship/releases).
- Select either zip or tar.gz (Windows and MacOS users, please use the **zip** download option)
- Open File Explorer on Windows, Files (or some other application to open files) on Linux, Finder on MacOS.
- Extract Battleship-1.0.0.zip in current directory. (If on Linux and installed tar.gz, do `tar -xvf Battleship-1.0.0.tar.gz`)
- Then do the following commands:
> ### Linux and MacOS:
> ```
> cd Downloads/Battleship-1.0.0/src
> javac battleship/Main.java
> java battleship.Main
> ```


## Possible errors:
> 1. Your computer may have an error that it can not start the program. The issue may be that you did not compile the code before starting. Another issue is that you do not have the java compiler installed. On Linux and MacOS systems do `sudo apt install openjdk-VERSION-jdk-headless` (you may have to do some research on what version you need. This program was written in Java 14. Recommend that you install Java 14 (`sudo apt install openjdk-14-jdk-headless`)).


## Other notes:
If you find any other errors with install/getting started, please create an issue [here](https://github.com/owencramer/Battleship/issues) or by pressing **Issues** at the top.


# How to play:
- The game will ask player 1 on where to place each ship. The first one will be the Carrier (5 dots). It will ask for an input (x, y). An example placement would be: `2 1 2 5`. These are the start point and endpoint (in this case, the carrier is vertical on the board). `2 1` is the start point and `2 5` is the end point. The points is very similar to a coordinate plane in your math class.
- Do this with the rest of the ships. All ships can be setup horizontally or vertially. The number of dots vary in ships.
