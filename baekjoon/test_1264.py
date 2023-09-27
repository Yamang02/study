vowels = ['a', 'e', 'i', 'o', 'u']

while(True) :
    sum = 0
    str = input()
    if(str != '#') :
        array = list(str.lower())
        for vowel in vowels :
            sum += array.count(vowel)

        print(sum)
    else :
        break

