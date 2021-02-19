# tkinter gui app
import tkinter as tk
from tkinter import messagebox

class Application(tk.Frame):
    def __init__(self, master=None):
        super().__init__(master)
        self.master = master
        self.pack()
        self.create_widgets()

    def create_widgets(self):
        self.weapon_types = tk.Button(self)
        self.weapon_types["height"] = 10
        self.weapon_types["width"] = 15
        self.weapon_types["text"] = "Weapon Types"
        self.weapon_types["command"] = self.show_weapon_types
        #red, green, yellow, blue
        self.weapon_types["activebackground"] = "yellow"
        self.weapon_types.PhotoImage = tk.PhotoImage(file = "C:\\Users\\" +
        	"Octavian\\Desktop\\github projects\\Practice-Repository\\" +
        	"80x80_season_five_hero_tokens.png")
        tk.Label(self.weapon_types, image = self.weapon_types.PhotoImage).pack()
        self.weapon_types.pack(side = "left", fill = "both",expand = False)

        self.armour_types = tk.Button(self)
        self.armour_types["height"] = 10
        self.armour_types["width"] = 15
        self.armour_types["text"] = "Armour Types"
        self.armour_types["command"] = self.show_armor_types
        #red, green, yellow, blue
        self.armour_types["activebackground"] = "yellow"
        self.armour_types.PhotoImage = tk.PhotoImage(file = "C:\\Users\\" +
        	"Octavian\\Desktop\\github projects\\Practice-Repository\\" +
        	"80x80_season_five_blades.png")
        tk.Label(self.armour_types, image = self.armour_types.PhotoImage).pack()
        self.armour_types.pack(side = "right")

        self.quit = tk.Button(self, text="QUIT", fg="red",
                              command=self.master.destroy)
        self.quit.pack(side="bottom")

    def show_weapon_types(self):
    	messagebox.showinfo('Weapon Types', 'Heavy Armour: Longsword and'
    		+ ' Shield, Shortsword and Shield, Poleaxe, Maul, Glaive\n\n' +
    		'Medium Armour: Musket, Nodachi, Spear\n\nLight Armour: Bow, ' +
    		'Shortbow, Dual Blades')

    def show_armor_types(self):
    	messagebox.showinfo('Armour Types', '1) Heavy\n2) Medium\n3) Light')

# root tkinder window
root = tk.Tk()
root.geometry("800x500")
root.resizable(width = 0, height = 0)
# creates the application
app = Application(master=root)
# window manager method calls
app.master.title("Conqueror's Blade Dictionary")
# starts the program
app.mainloop()