import tkinter as tk

numer = 18

def main():
    root = tk.Tk()

    dane_content = tk.StringVar()
    dane_content.set("Podaj Imię i Nazwisko")
    klasa_content = tk.StringVar()
    klasa_content.set("Podaj klasę")

    config(root)

    dane = tk.Label(root, textvariable = dane_content)
    dane.grid(column = numer, row = numer)
    klasa = tk.Label(root, textvariable = klasa_content)
    klasa.grid(column = numer, row = numer + 1)

    dane_input = tk.Entry(root, font = ("none", 16))
    dane_input.grid(column = numer + 1, row = numer)
    klasa_input = tk.Entry(root, show="*", font = ("none", 16))
    klasa_input.grid(column = numer + 1, row = numer + 1)
    tk.Button(root, text = "Podaj dane", bg = "orage", font = "Verdana 16 bold", command = lambda: dane_content.set(f"Cześć {dane_input.get()}")).grid(column = numer + 2, row = numer) # Imie i nazwisko
    tk.Button(root, text = "Podaj Klasę", bg = "blue", font = "Arial 16 italic", command = lambda: klasa_content.set(f"Jesteś z klasy {klasa_input.get()}")).grid(column = numer + 2, row = numer + 1)  # Klasa

    root.mainloop()

def config(root):
    root.geometry(f"{numer*30}x{numer*30}")
    root.title("ZSEiT")

if __name__ == "__main__":
    main()
