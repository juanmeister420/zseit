import tkinter as tk

numer = 18

def main():
    root = tk.Tk()

    name_content = tk.StringVar()
    name_content.set("Podaj Imię i Nazwisko")
    division_content = tk.StringVar()
    division_content.set("Podaj klasę")

    config(root)

    name = tk.Label(root, textvariable = name_content)
    name.grid(column = numer, row = numer)
    division = tk.Label(root, textvariable = division_content)
    division.grid(column = numer, row = numer + 1)

    name_input = tk.Entry(root, font = ("none", 16))
    name_input.grid(column = numer + 1, row = numer)
    division_input = tk.Entry(root, show="*", font = ("none", 16))
    division_input.grid(column = numer + 1, row = numer + 1).
    tk.Button(root, text = "Podaj dane", bg = "#931621", font = "Arial 16 bold", command = lambda: name_content.set(f"Cześć {name_input.get()}")).grid(column = numer + 2, row = numer) # Imie
    tk.Button(root, text = "Podaj Klasę", bg = "red", font = "Verdana 16 italic", command = lambda: division_content.set(f"Jesteś z klasy {division_input.get()}")).grid(column = numer + 2, row = numer + 1)  # Klasa

    root.mainloop()

def config(root):
    root.geometry(f"{numer*30}x{numer*30}")
    root.title("ZSEiT")

if __name__ == "__main__":
    main()
