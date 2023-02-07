# Inicjalizacja klasy Client
#
# Klasa przechowuje informacje o kliencie
# oraz metody do zarządzania nimi
# getClientID - pobranie identyfikatora klienta
# getClientType - pobranie typu klienta
# getClientName - pobranie nazwy klienta


class Client:
    def __init__(self, clientID, clientType, clientName):
        self.clientID = clientID
        self.clientType = clientType
        self.clientName = clientName
    
    def getClientID(self):
        return self.clientID
    
    def getClientType(self):
        return self.clientType
    
    def getClientName(self):
        return self.clientName

# Inicjalizacja klasy CorporateClient
#
# Klasa dziedziczy po klasie Client
# przechowuje informacje o kliencie biznesowym
# oraz metody do zarządzania nimi
# getBusinessName - pobranie nazwy firmy
# getBusinessAddress - pobranie adresu firmy

class CorporateClient(Client):
    def __init__(self, clientID, clientName, businessName, businessAddress):
        super().__init__(clientID, "Corporate", clientName)
        self.businessName = businessName
        self.businessAddress = businessAddress
    
    def getBusinessName(self):
        return self.businessName
    
    def getBusinessAddress(self):
        return self.businessAddress
