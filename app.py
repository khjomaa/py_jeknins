from datetime import datetime


def show_time():
    print(datetime.now())


if __name__ == "__main__":
    print('The current date and time is:')
    show_time()