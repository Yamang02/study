import googletrans

translator = googletrans.Translator()

text = '안녕, 세상아!'

result = translator.translate(text, dest='en')

print(result)