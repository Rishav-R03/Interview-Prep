'''
    Notes are present in 5 in 1 spiral notebook

'''

class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    def display_name(self):
        print(f"Dog's name is {self.name}")
    
    def display_age(self):
        print(f"Dog's age is {self.age}")
    
class Labrador(Dog): # inherit from Dog class, single inheritance
    def sound(self):
        print(f"{self.name} barks")
    
class GuideDog(Labrador):
    def guide_dog(self): # multilevel inheritance
        print(f"{self.name} is a guide dog")

class Friendly:
    def greet(self):
        print(f"Hello {self.name}, wagging my tail")
class GoldenRetriever(Dog,Friendly): # multiple inheritance
    def sound(self):
        print(f"Golden Retriver barks")
        # return super().sound()

if __name__ == "__main__":

    dog1 = Dog("Bruno",3)
    # print(dog1)
    print(f"Dog's name is {dog1.name} and is age is {dog1.age}") # dog1.display_name()

    lab = Labrador("Charlie",4)
    print(f"The dog is saying that his name is  {lab.name} and his age is {lab.age}")

    guide = GuideDog("Scooby",5)
    guide.sound()
    guide.display_name()
    guide.display_age()
    guide.guide_dog()

    golden = GoldenRetriever("Max",6)
    golden.sound()
    golden.greet()