import tkinter as tk

window = tk.Tk()
window.winfo_toplevel().title("3TP gr.2")
window.geometry("400x200")
window.iconbitmap("logo-elektronik.ico")
window.configure(bg='blue')
tk.Label(window, text="Maciej", font="Arial 18 bold", background="yellow").pack()
tk.Label(window, text="Monkiewicz", font="Verdana 18 italic", background="green").pack()
# Inicjalizacja
window.mainloop()
