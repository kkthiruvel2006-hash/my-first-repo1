def greet(name):
    return f"Hello, {name}! Welcome to GitHub."

if __name__ == "__main__":
    user = input("Enter your name: ")
    print(greet(user))