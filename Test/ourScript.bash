./jlsCircuitTester -m 451 ../JLS\ Files/fuck.jls umm | grep "Errors detected" | awk -F"-" '{print $2}' | awk -F":" '{print $1}' > ourFile.txt
