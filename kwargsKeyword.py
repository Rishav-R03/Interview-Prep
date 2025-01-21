# **kwargs is used to pass a variable number of keyword arguments to a function.
# the ** collects the items in to a dictionary

def func(**kwargs):
    for key,val in kwargs.items():
        print(f"{key} is {val}")

func(name = "Dhruv",age = 20,city="Delhi")

class Person:
    def __init__(self,**kwargs):
        self.name = kwargs.get("name")
        self.age = kwargs.get("age")

    def greet(self):
        print(f"Hello {self.name} and {self.age} years old")
    
p1 = Person(name="Dhruv",age=20)
p1.greet()


