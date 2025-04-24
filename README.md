# 🎯 Number Guessing Game (Java)

A fun and interactive Java console game where the player tries to guess the number the computer has randomly chosen — within a limited number of attempts!

## 🕹️ Features

- The computer randomly selects a number between **1 and 10**
- The user has **3 attempts** to guess the correct number
- Provides feedback after each guess
- Reveals the correct number if all guesses are incorrect

## 🚀 Getting Started

### Requirements

- Java Development Kit (JDK 8 or higher)

### How to Compile

```bash
javac NumbersGuessingGame.java
```

### How to Run

```bash
java day7.NumbersGuessingGame
```

> 📁 Note: The `package day7;` line in your code requires the file to be inside a folder named `day7`. Make sure your terminal is in the **parent directory** of `day7/` when you compile and run.

## 🖥️ Example Gameplay

```
It's a Number Guessing Game!
Now, guess a number between 1 and 10
You have 3 attempts,
Attempt 1 Enter your guess
4
Wrong guess
Try Again
Attempt 2 Enter your guess
7
Wrong guess
Try Again
Attempt 3 Enter your guess
2
You're out of guesses :( the number was: 6
```

Or, if the player wins:

```
Attempt 2 Enter your guess
6
Good Job! 6 Is the number I was thinking! :D
```

## 🧠 How It Works

- Generates a random number using `Random.nextInt(10) + 1`
- Loops through up to 3 attempts
- Checks if the user's guess matches the random number
- Displays win/loss messages accordingly

## 💡 Enhancements You Could Add

- Let users choose difficulty (number range or attempts)
- Provide hints like “Too high” or “Too low”
- Track number of games played and wins
- Add a replay option

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
# NumbersGuessingGame
