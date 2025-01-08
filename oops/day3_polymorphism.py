class Dog:
    def sound(self):
        print("Dog's woof") # default implementation
    
# run-time polymorphism: Method overriding
class Labrador(Dog):
    def sound(self):
        print("Labrador's woof") # Overidding parent method
    
class Beagle(Dog):
    def sound(self):
        print("Beagle's woof") # Overidding parent method

# compile time paolymorphism: Method overloading mimic

class Calculator:
    def add(self,a,b=0,c=0):
        return a+b+c # supports multiple ways to call add()


if __name__ == "__main__":
    dogs = [Dog(),Labrador(),Beagle()]
    for dog in dogs:
        dog.sound()

    calc = Calculator()
    print(calc.add(1,2,3))
    print(calc.add(1,2))
    print(calc.add(1))


    
