import tkinter as tk
from tkinter.constants import CENTER

window = tk.Tk()
# Labele

label1 = tk.Label(window, text="Imię", font="Arial 18 bold", background="yellow")

label2 = tk.Label(window, text="Nazwisko", font="Verdana 24 italic", background="#fff")

# funckje na zmiane tekstu
def change_label1():
    label1.config(text="Maciej")
def change_label2():
    label2.config(text="Monkiewicz")
# Stworzenie przycisków
button = tk.Button(window, text="przycisk1", bg="red", fg="white", font=("Arial", 12), command=change_label1)
button2 = tk.Button(window, text="przycisk2", bg="green", fg="white", font=("Verdana", 12), command=change_label2)

# Aplikacja
window.winfo_toplevel().title("ZSEiT")
window.geometry("360x360")
window.configure(bg='blue')
label1.grid(row=18, column=18)
button.grid(row=18, column=19)

label2.grid(row=19, column=18)
button2.grid(row=19, column=19)
# Inicjalizacja
window.mainloop()