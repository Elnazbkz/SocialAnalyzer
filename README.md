# SocialAnalyzer

The Social Media Analyzer App allows you to manage and analyze social media posts. It offers a command-line interface for adding, deleting, and retrieving posts, as well as retrieving top posts based on likes and shares.

## Installation

1. Ensure you have Java JDK installed.
2. Clone or download the repository.
3. Navigate to the project directory.
4. Compile using: `javac SocialMediaAnalyzer/*.java`
5. Run using: `java SocialMediaAnalyzer.UserInterface`

## Usage

- Run the app: `java SocialMediaAnalyzer.UserInterface`
- Follow the menu options to perform actions.
- Exit the app using option 6.

## Console Options Guide
After running the app, you'll be presented with the main menu. Choose an option by entering the corresponding number and pressing Enter.

1. <b>Add a social media post</b>

    This option allows you to add a new social media post to the collection.
    You'll be prompted to provide details such as ID, content, author, likes, shares, and timestamp.
    Delete an existing social media post

2. <b>Delete an existing social media post</b>
    Use this option to delete an existing post by providing its ID.
    If the post is found and successfully removed, a confirmation message will be displayed.
    Retrieve a social media post

3. <b>Retrieve a social media post</b>
    Retrieve a specific post by entering its ID.
    If the post exists, its details will be displayed. Otherwise, a message indicating that the post does not exist will appear.
    Retrieve the top N posts with most likes

4. <b>Retrieve the top N posts with the most likes.</b>
    You'll be prompted to specify the value of N.
    The app will display the specified number of posts with the highest likes.
    Retrieve the top N posts with most shares

5. <b>Retrieve the top N posts with the most shares.</b>
    You'll be prompted to specify the value of N.
    The app will display the specified number of posts with the highest shares.

6. <b>Exit</b>
    Select this option to exit the app

## Features

- Add, delete, and retrieve posts.
- Retrieve top posts by likes and shares.