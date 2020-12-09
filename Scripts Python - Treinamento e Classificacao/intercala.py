import xlsxwriter
import pandas as pd

trainingNews = pd.read_excel( 'Training Set.xlsx', header = None, names = ['A', 'B'] )

columnA = trainingNews['A']
columnB = trainingNews['B']
workbook = xlsxwriter.Workbook( 'Training Set_Intercalado.xlsx' )
worksheet = workbook.add_worksheet()

row = 0
column = 0

listAmbiente = []
listTurismo = []
listCiencia = []
listCotidiano = []
listEducacao = []
listEsporte = []
listMercado = []
listMundo = []
listPolitica = []

while row < len(columnA):
    if columnB[row] == "ambiente":
        listAmbiente.append(columnA[row])
    elif columnB[row] == "turismo":
        listTurismo.append(columnA[row])
    elif columnB[row] == "ciencia":
        listCiencia.append(columnA[row])
    elif columnB[row] == "cotidiano":
        listCotidiano.append(columnA[row])
    elif columnB[row] == "educacao":
        listEducacao.append(columnA[row])
    elif columnB[row] == "esporte":
        listEsporte.append(columnA[row])
    elif columnB[row] == "mercado":
        listMercado.append(columnA[row])
    elif columnB[row] == "mundo":
        listMundo.append(columnA[row])
    else:
        listPolitica.append(columnA[row])

    row += 1

iAmb = 0
iterator = 0
row = 0
while row < len(columnA):
    if iAmb < len(listAmbiente):
        worksheet.write( row, column, listAmbiente[iAmb] )
        worksheet.write( row, column + 1, "ambiente" ) 
        row += 1
    worksheet.write( row, column, listTurismo[iterator] )
    worksheet.write( row, column + 1, "turismo" ) 
    row += 1
    worksheet.write( row, column, listCiencia[iterator] )
    worksheet.write( row, column + 1, "ciencia" ) 
    row += 1
    worksheet.write( row, column, listCotidiano[iterator] )
    worksheet.write( row, column + 1, "cotidiano" ) 
    row += 1
    worksheet.write( row, column, listEducacao[iterator] )
    worksheet.write( row, column + 1, "educacao" ) 
    row += 1
    worksheet.write( row, column, listEsporte[iterator] )
    worksheet.write( row, column + 1, "esporte" ) 
    row += 1
    worksheet.write( row, column, listMercado[iterator] )
    worksheet.write( row, column + 1, "mercado" ) 
    row += 1
    worksheet.write( row, column, listMundo[iterator] )
    worksheet.write( row, column + 1, "mundo" ) 
    row += 1
    worksheet.write( row, column, listPolitica[iterator] )
    worksheet.write( row, column + 1, "politica" ) 
    row += 1
    iAmb += 1
    iterator += 1

workbook.close()