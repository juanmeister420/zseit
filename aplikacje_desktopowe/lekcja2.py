class Employee:
    count = 0
    def __init__(self, imie, nazwisko, email, pensja):
        self.imie = f"{imie} {nazwisko}"
        self.email = email
        self.pensja = pensja
        Employee.count += 1

    def get_annual_salary(self):
        return (f"Roczne wynagrodzenie {self.pensja*12}")

    def show_employee_information(self):
        return (f"Pracownik: {self.imie}, adres e-mail: {self.email}, wynagrodzenie miesięczne: {self.pensja}")

pracownik = Employee("Jan", "Kowalski", "j.kowalski@firma.com", 1200)

print(pracownik.get_annual_salary())
print(pracownik.show_employee_information())