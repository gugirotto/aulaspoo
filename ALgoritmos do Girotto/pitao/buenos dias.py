import math
top = False
while(not top):
    try:
        x= float(input("lançe um metro: "))
    except ValueError:
        print("digite direito home")
    else:
        litro = x/3
        lata = math.ceil (litro/18)

        print(" voce precisa comprar: " + str(lata) + " latas pelo preço de " + str(lata*80)+ " reais") 

        top = True
