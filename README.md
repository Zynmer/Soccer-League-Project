# Soccer-League-Project

## Purpose of Project
This project allows the user to simulate soccer games between four teams.

## How it works
This project uses JOptionPane for its UI. It allows the user to use their mouse to navigate menus and takes input for temperature. The temperature is used by the program to determine whether a game is played or not. After three consecutive times a game is not played due to temperature the soccer season ends and the user can start over or close the program.

The "View Teams" button shows: team names, wins, losses, and ties. The "View Games" button shows games played between teams with wins and the temperature for those games. The "Temp" button shows an input box that allows the user to input the temperature for the day. At any point if an invalid input is taken the user is returned to the main menu of the program.

## Game Class
The Game Class keeps track of the teams, team scores, and temperature. It then returns that data to be used in the Scheduler class.

## Scheduler Class
The Scheduler Class contains the logic for game simulation and consecuative cold days that end the season. It returns the data as strings to be used in JOptionPane.

## Main Class
The Main Class contains the logic for the UI of the program. The UI is made using JOptionPane.
