def lookup(name):
    if name in phonebook:
        return name +"="+phonebook[name]
    else:
        return "Not found"

n = int(input())
phonebook={}
for a in range(n):
    data=input().split()
    phonebook[data[0]]=data[1]
while True:
    try:
        name = input()
    except EOFError:
        break
    print(lookup(name))
