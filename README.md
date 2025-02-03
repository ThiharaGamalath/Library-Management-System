# Library Management System (LMS)

## Introduction  
The **Library Management System (LMS)** is a console-based Java application that allows users to manage a library's collection of books. Users can add books, view books, borrow books, and search for books by author. This system simulates the basic functionalities of a library, providing an easy-to-use interface for managing books.

## Functionality  
### 1. **Add Books**
- This option allows the user to add new books to the library by entering the book's title, author, and ISBN.  
- Once a book is added, it is stored in the system, and the user receives a confirmation message.

### 2. **View Books**
- This option displays all the books currently available in the library. The list includes the title, author, ISBN, and availability status.

### 3. **Borrow Books**
- Users can borrow books by entering the ISBN of the book they wish to borrow.  
- If the book is available, it will be marked as borrowed, and the user will receive a success message.  
- If the book is already borrowed, an appropriate message will be shown to the user.

### 4. **Return Books**
- This option allows users to return a book they borrowed.  
- By entering the ISBN of the book they want to return, the availability status will be updated to "available."

### 5. **Exit**
- This option allows the user to exit the system gracefully.

## Screenshots  
### 1. Main Menu
The main menu, where the user selects an option:  
![Main Menu](![image](https://github.com/user-attachments/assets/b65236b7-e725-4042-ae28-b201f341c579)
)

### 2. Adding a New Book
The prompt when adding a new book:  
![Add Book](![image](https://github.com/user-attachments/assets/82fcd715-8136-4de6-abb2-7abbea3ca6ad)
)

### 3. Viewing the List of Books
The output when viewing the list of books:  
![View Books](![image](https://github.com/user-attachments/assets/7b5ad6e9-4d0c-4ba6-bdbe-a8239cebda78)
)

### 4. Borrowing and Returning a Book
The process of borrowing and returning a book:  
![Borrow and Return](![image](https://github.com/user-attachments/assets/eb61ef62-2ff3-4731-b12c-19af2efa53ec)
)

## How to Run the System  
To run the Library Management System locally, follow these steps:

1. **Clone the repository**:
   - Use the following command to clone the repository:  
     ```bash
     git clone https://github.com/your-username/library-management-system.git
     ```
2. **Navigate to the project folder**:
   - Change to the project directory:
     ```bash
     cd library-management-system
     ```
3. **Run the Application**:
   - Compile and run the **Library Management System** in your IDE or command line:
     ```bash
     javac LibraryManagementSystem.java
     java LibraryManagementSystem
     ```

## License  
This project is licensed under the **MIT License** - see the LICENSE file for details.

## Contributing  
If you'd like to contribute to this project, feel free to fork the repository, make changes, and submit a pull request. Please follow the guidelines outlined in the CONTRIBUTING file.

## Contact  
For any inquiries or issues, feel free to reach out:  
- Email: your-email@example.com  
- GitHub: [Your GitHub Profile](https://github.com/your-username)
