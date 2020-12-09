import xlsxwriter
import pandas as pd
import xlrd as xlrd

stopWords = [ 'a', 'à', 'agora', 'ainda', 'alguém', 'algum', 'alguma', 'algumas', 'alguns', 'ampla', 'amplas', 'amplo', 'amplos', 'ante', 'antes', 'ao', 'aos', 'após', 'aquela', 'aquelas', 'aquele', 'aqueles', 'aquilo', 'as', 'às', 'até', 'através', 'cada', 'coisa', 'coisas', 'com', 'como', 'contra', 'contudo', 'da', 'daquele', 'daqueles', 'das', 'de', 'dela', 'delas', 'dele', 'deles', 'depois', 'dessa', 'dessas', 'desse', 'desses', 'desta', 'destas', 'deste', 'destes', 'deve', 'devem', 'devendo', 'dever', 'deverá', 'deverão', 'deveria', 'deveriam', 'devia', 'deviam', 'disse', 'disso', 'disto', 'dito', 'diz', 'dizem', 'do', 'dos','e','é','ela','elas','ele','eles','em','entre','era','eram','éramos','essa','essas','esse','esses','esta','está','estamos','estão','estas','estava','estavam','estávamos','este','esteja','estejam','estejamos','estes','esteve','estive','estivemos','estiver','estivera','estiveram','estivéramos','estiverem','estivermos','estivesse','estivessem','estivéssemos','estou','eu','foi','fomos','for','fora','foram','fôramos','forem','formos','fosse','fossem','fôssemos','fui','há','haja','hajam','hajamos','hão','havemos','havia','hei','houve','houvemos','houver','houvera','houverá','houveram','houvéramos','houverão','houverei','houverem','houveremos','houveria','houveriam','houveríamos','houvermos','houvesse','houvessem','houvéssemos','isso','isto','já','lhe','lhes','mais','mas','me','mesmo','meu','meus','minha','minhas','muito','na','não','nas','nem','no','nos','nós','nossa','nossas','nosso','nossos','num','numa','o','os','ou','para','pela','pelas','pelo','pelos','por','qual','quando','que','quem','são','se','seja','sejam','sejamos','sem','ser','será','serão','serei','seremos','seria','seriam','seríamos','seu','seus','só','sobre','somos','sou','sua','suas','também','te','tem','têm','temos','tenha','tenham','tenhamos','tenho','ter','terá','terão','terei','teremos','teria','teriam','teríamos','teu','teus','teve','tinha','tinham','tínhamos','tive','tivemos','tiver','tivera','tiveram','tivéramos','tiverem','tivermos','tivesse','tivessem','tivéssemos','tu','tua','tuas','um','uma','você','vocês','vos','A','À','Agora','Ainda','Alguém','Algum','Alguma','Algumas','Alguns','Ampla','Amplas','Amplo','Amplos','Ante','Antes','Ao','Aos','Após','Aquela','Aquelas','Aquele','Aqueles','Aquilo','As','Às','Até','Através','Cada','Coisa','Coisas','Com','Como','Contra','Contudo','Da','Daquele','Daqueles','Das','De','Dela','Delas','Dele','Deles','Depois','Dessa','Dessas','Desse','Desses','Desta','Destas','Deste','Destes','Deve','Devem','Devendo','Dever','Deverá','Deverão','Deveria','Deveriam','Devia','Deviam','Disse','Disso','Disto','Dito','Diz','Dizem','Do','Dos','E','É','Ela','Elas','Ele','Eles','Em','Entre','Era','Eram','Éramos','Essa','Essas','Esse','Esses','Esta','Está','Estamos','Estão','Estas','Estava','Estavam','Estávamos','Este','Esteja','Estejam','Estejamos','Estes','Esteve','Estive','Estivemos','Estiver','Estivera','Estiveram','Estivéramos','Estiverem','Estivermos','Estivesse','Estivessem','Estivéssemos','Estou','Eu','Foi','Fomos','For','Fora','Foram','Fôramos','Forem','Formos','Fosse','Fossem','Fôssemos','Fui','Há','Haja','Hajam','Hajamos','Hão','Havemos','Havia','Hei','Houve','Houvemos','Houver','Houvera','Houverá','Houveram','Houvéramos','Houverão','Houverei','Houverem','Houveremos','Houveria','Houveriam','Houveríamos','Houvermos','Houvesse','Houvessem','Houvéssemos','Isso','Isto','Já','Lhe','Lhes','Mais','Mas','Me','Mesmo','Meu','Meus','Minha','Minhas','Muito','Na','Não','Nas','Nem','No','Nos','Nós','Nossa','Nossas','Nosso','Nossos','Num','Numa','O','Os','Ou','Para','Pela','Pelas','Pelo','Pelos','Por','Qual','Quando','Que','Quem','São','Se','Seja','Sejam','Sejamos','Sem','Ser','Será','Serão','Serei','Seremos','Seria','Seriam','Seríamos','Seu','Seus','Só','Sobre','Somos','Sou','Sua','Suas','Também','Te','Tem','Têm','Temos','Tenha','Tenham','Tenhamos','Tenho','Ter','Terá','Terão','Terei','Teremos','Teria','Teriam','Teríamos','Teu','Teus','Teve','Tinham','Tínhamos','Tive','Tivemos','Tiver','Tivera','Tiveram','Tivéramos','Tiverem','Tivermos','Tivesse','Tivessem','Tivéssemos','Tu','Tua','Tuas','Um','Uma','Você','Vocês', 'Vos' ]

# stopWordsSheet = pd.read_excel('Stop Words.xlsx', header = None, names = ['A'])
# stopWords = stopWordsSheet['A']

#firstNew = "João Alberto foi espancado por mais de 5 minutos antes de morrer, diz polícia"
#secondNew = "Após início pacífico, protesto teve confusão em Porto Alegre" 
newsSheet = pd.read_excel('Test Set_v1 Covid.xlsx', header = None, names = ['A', 'B'])
news = newsSheet['A']
labels = newsSheet['B']

workbook = xlsxwriter.Workbook( 'Test Set_v1 Covid SW.xlsx' )
worksheet = workbook.add_worksheet()

#firstSplited = firstNew.split()
#secondSplited = secondNew.split()

# firstSplitedResult = []
# secondSplitedResult = []

splited = []
splitedResult = []

""" for i in range( len(firstSplited) ):
    if firstSplited[i] not in stopWords:
        firstSplitedResult.append( firstSplited[i] ) """

for i in range( len(news) ):
    splited = news[i].split()

    for j in range( len(splited) ):
        if splited[j] not in stopWords: splitedResult.append( splited[j] )

    worksheet.write( i, 0, " ".join(splitedResult) )

    splitedResult.clear()

row = 0
for k in labels:
    worksheet.write( row, 1, k )
    row += 1

workbook.close()

""" firstResult = " ".join(firstSplitedResult)
secondResult = " ".join(secondSplitedResult)

print("First new: " + firstNew)
print("First result: " + firstResult)
print()
print("Second new: " + secondNew)
print("Second result: " + secondResult) """