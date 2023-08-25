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

## Console Options Example
Here is an example of the console environment for this java app
<br/>

`Welcome to Social Media Analyzer!
---------------------------------------------------
> Select from main menu
----------------------------------------------------
1) Add a social media post
2) Delete an existing social media post
3) Retrieve a social media post
4) Retrieve the top N posts with most likes
5) Retrieve the top N posts with most shares
6) Exit
Please select: 2
Please provide the post ID: 2222
Sorry the post does not exist in the collection!
---------------------------------------------------
> Select from main menu
----------------------------------------------------
1) Add a social media post
2) Delete an existing social media post
3) Retrieve a social media post
4) Retrieve the top N posts with most likes
5) Retrieve the top N posts with most shares
6) Exit
Please select: 1
Please provide the post ID: 101
Please provide the post content: Test Content
Please provide the post author: Test Author
Please provide the number of likes of the post: 20233
Please provide the number of shares of the post: 10432
Please provide the date and time of the post in the format of DD/MM/YYYY HH:MM: 11/11/2022 11:11
The post has been added to the collection!
---------------------------------------------------
> Select from main menu
----------------------------------------------------
1) Add a social media post
2) Delete an existing social media post
3) Retrieve a social media post
4) Retrieve the top N posts with most likes
5) Retrieve the top N posts with most shares
6) Exit
Please select: 3
Please provide the post ID: 1001
Sorry, the post does not exist in the collection!
---------------------------------------------------
> Select from main menu
----------------------------------------------------
1) Add a social media post
2) Delete an existing social media post
3) Retrieve a social media post
4) Retrieve the top N posts with most likes
5) Retrieve the top N posts with most shares
6) Exit
Please select: 3
Please provide the post ID: 101
Retrieved post: 101 | Test Content | 20233
---------------------------------------------------
> Select from main menu
----------------------------------------------------
1) Add a social media post
2) Delete an existing social media post
3) Retrieve a social media post
4) Retrieve the top N posts with most likes
5) Retrieve the top N posts with most shares
6) Exit
Please select: 4
Please specify the number of posts to retrieve (N): 10
The top-10 posts with the most likes are:
1) 101 | Test Content | 20233
2) 382 | What a miracle! | 2775
3) 10 | Check out this epic film. | 1000
4) 37221 | Are we into Christmas month already?! | 526
5) 36778 | Fantastic day today. Congratulations to all winners. | 230
6) 20582 | Come and meet us at Building 14 of RMIT. | 10
---------------------------------------------------
> Select from main menu
----------------------------------------------------
1) Add a social media post
2) Delete an existing social media post
3) Retrieve a social media post
4) Retrieve the top N posts with most likes
5) Retrieve the top N posts with most shares
6) Exit
Please select: 5
Please specify the number of posts to retrieve (N): 2
The top-2 posts with the most shares are:
1) 382 | What a miracle! | 13589
2) 101 | Test Content | 10432
---------------------------------------------------
> Select from main menu
----------------------------------------------------
1) Add a social media post
2) Delete an existing social media post
3) Retrieve a social media post
4) Retrieve the top N posts with most likes
5) Retrieve the top N posts with most shares
6) Exit
Please select: 6
Thanks for using Social Media Analyzer!`


## Features

- Add, delete, and retrieve posts.
- Retrieve top posts by likes and shares.