# create class called "Sklep" with attributes: name, address, products
# add a destructor to the class
# create a method called "add_product" which adds a product to the list of products
# create a method called "remove_product" which removes a product from the list of products
# create a method called "show_products" which prints all products

class Sklep:
    def __init__(self, name, address):
        self.name = name
        self.address = address
        self.products = []
    def __del__(self):
        print("Usuwam sklep")
    def add_product(self, product):
        self.products.append(product)
    def remove_product(self, product):
        self.products.remove(product)
    def show_products(self):
        print(self.products)

sklep = Sklep("Sklep", "ul. Sklepowa 1")
sklep.add_product("Produkt 1")
sklep.add_product("Produkt 2")

sklep.show_products()