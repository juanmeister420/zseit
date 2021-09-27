slowo = input("Wprowadź słowo: ")

for i in range(len(slowo)):
    if i%2==1:
        slowo = slowo.replace(slowo[i],"x")

print(slowo)