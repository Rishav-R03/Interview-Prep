'''
    Notes are present in 5 in 1 spiral notebook
'''

# creating a class
class Dog:
    species = "canine" # class attribute, shared by all instance in class
    def __init__(self,name,age):
        self.name = name # instance attribute
        self.age = age # instance attribute

    def __str__(self):
        return f"{self.name} is {self.age} years old"
    

if __name__ == "__main__":
    dog1 = Dog("Bruno", 3) # creating an instance (object)
    dog2 = Dog("Charlie", 4) # creating an instance (object)
    print(dog1)
    print(dog2)

    print(dog1.species)
    dog2.species = "carnivore" # update the class attribute
    print(dog2.species)
    dog1.name = "newName"
    print(dog1)