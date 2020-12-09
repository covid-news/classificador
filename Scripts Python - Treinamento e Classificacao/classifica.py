from textblob import TextBlob 
from textblob.classifiers import NaiveBayesClassifier
import xlsxwriter
import pandas as pd
import xlrd as xlrd

trainingNews = pd.read_excel('Training Set_v1 Covid SW Stemming.xlsx', header = None, names = ['A', 'B'])
testNews = pd.read_excel( 'Test Set_v1 Covid SW Stemming.xlsx', header = None, names = ['A', 'B'] )
"""book = load_workbook( 'Test Set.xlsx' )
sheet = book['Plan1']"""
clf = NaiveBayesClassifier(trainingNews.values, format = ".xlsx")

#print("Noticia | Classificacao | Rotulo")

#data = [ testNews['A'], clf.classify(testNews['A']), testNews['B'] ]
columnA = testNews['A']
columnB = testNews['B']
#classfied = clf.classify(testNews['A'])
workbook = xlsxwriter.Workbook( 'Test Results_v1 Covid.xlsx' )
worksheet = workbook.add_worksheet()

row = 0
column = 0

"""for i in columnA:
    worksheet.write( row, 0, i )
    row += 1

row = 0
for j in classfied:
    worksheet.write( row, 1, j )
    row += 1"""

while row < len(columnA):
    worksheet.write( row, column, columnA[row] )
    worksheet.write( row, column + 1, clf.classify( columnA[row] ) )
    row += 1

row = 0
for k in columnB:
    worksheet.write( row, 2, k )
    row += 1

"""for columnA, classification, columnB in data:
    worksheet.write (row, column, columnA)
    worksheet.write (row, column + 1, classification)
    worksheet.write (row, column + 2, columnB)

    row += 1"""

workbook.close()

"""print(clf.classify('Obesidade pode agravar covid-19 por provocar inflamação no organismo'))
print(clf.classify('Fortalecimento de Merkel freia o crescimento da extrema direita na Alemanha'))"""