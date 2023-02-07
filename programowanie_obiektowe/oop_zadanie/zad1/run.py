# import classes
from bank import Bank
from account import BankAccount
from person import Customer
from person import Employee
from client import CorporateClient



def run():
    # Create instances of classes
    bank = Bank("Sample Bank")
    account = BankAccount("1234567890", 1000)
    customer = Customer("C001", "John Doe", "123 Main St", "123-456-7890")
    employee = Employee("E001", "Jane Doe", "456 Elm St", "234-567-8901", "Manager")
    corporateClient = CorporateClient("CC001", "Acme Inc.", "Acme Inc.", "789 Broadway")
    
    # Add account to the bank
    bank.createAccount(account)
    
    # Perform transactions
    account.deposit(500)
    account.withdraw(200)
    
    # Print account balance
    print("Account balance:", account.checkBalance())
    
    # Print customer details
    print("Customer Name:", customer.getName())
    print("Customer Address:", customer.getAddress())
    print("Customer Phone:", customer.getPhoneNumber())
    
    # Print employee details
    print("Employee Name:", employee.getName())
    print("Employee Address:", employee.getAddress())
    print("Employee Phone:", employee.getPhoneNumber())
    print("Employee Designation:", employee.getDesignation())
    
    # Print corporate client details
    print("Client ID:", corporateClient.getClientID())
    print("Client Type:", corporateClient.getClientType())
    print("Client Name:", corporateClient.getClientName())
    print("Business Name:", corporateClient.getBusinessName())
    print("Business Address:", corporateClient.getBusinessAddress())

if __name__ == "__main__":
    run()
