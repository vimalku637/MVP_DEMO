# MVP User Info App 🧑‍💼📧

A simple Android app demonstrating the MVP (Model-View-Presenter) architecture. It allows users to enter their name and email and displays the result on button click.

---

## ✨ Features

- Enter name and email
- Display user info using MVP pattern
- Clean separation of concerns

---

## 📐 Architecture: MVP


### 🔹 Model
Represents the user data (`User.kt`)

### 🔹 View
The activity (`MainActivity.kt`) which implements `UserView` interface.

### 🔹 Presenter
Contains logic (`UserPresenter.kt`) to handle user interaction and update the view.

---

## 📱 Screenshots

> Add screenshots here if available

---

## 📁 Project Structure

com.example.mvpapp/
├── model/
│ └── User.kt
├── presenter/
│ └── UserPresenter.kt
├── view/
│ ├── UserView.kt
│ └── MainActivity.kt


---

## 🚀 Getting Started

1. Clone the repo:

```bash
git clone https://github.com/yourusername/mvp-user-info.git

Open in Android Studio

Build and Run

🛠 Technologies Used
Kotlin

MVP Architecture

Android SDK
