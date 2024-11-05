# UserStory-Project

# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

As a music artist, I want to analyze music data to create an album in th emost popular genre among teens. 

## Dataset 

Dataset: https://www.kaggle.com/datasets/ambaliyagati/spotify-dataset-for-playing-around-with-sql
- **Name** (String) - the name of the song
- **Genre** (String) - the genre of the song
- **Duration** (int) - the duration/ lenght of the song in milliseconds
- **Popularity** (int) - the popularity of the song

## UML Diagram 

[UML Diagram for my project](https://photos.google.com/photo/AF1QipPj897a0nbc-7xA_z_g8u0-d8JxoXBfAHagCeMu)


## Description 

For my project, I decided to create a user story that goes into depth about making music, paricularly within the most popular genre. With this information, music artists could be more aware of what the young age group listens to which results in higher numbes of streams. In the code, my partner and I added a 1D array that will go through all the txt files that hold the important information such as the genre, duration, and popularity of the song. Diving deeper into the code, we created a traversal to see what genre is the most popular. When the array is fully traverses, the console prints out each varibale and ultimately prints out the genre with the most popular song. We chose the dataset that we chose because it clearly shows the information that we need that will help the user find the information that they're looking for, which is the genre with the most popular song.
