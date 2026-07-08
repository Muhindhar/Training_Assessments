import re
try:
    f = open("serverlog.txt", "r")
    data = f.read()
    lines = data.split("\n")
    print("Total Lines :",len(lines))
    print("Total Words :",len(data.split()))
    print("Total Characters :",len(data))

    vow = 0
    for ch in data.lower():
        if ch in "aeiou":
            vow+=1
    print("Total Vowels :",vow)

    info = len(re.findall(r"\[INFO\]",data))
    print("INFO :",info)
    warn = len(re.findall(r"\[WARNING\]",data))
    print("WARNING :", warn)
    err = len(re.findall(r"\[ERROR\]",data))
    print("ERROR :", err)
    crit = len(re.findall(r"\[CRITICAL\]",data))
    print("CRITICAL :", crit)
    print("ALERTS")

    for line in lines:
        if "ERROR" in line or "CRITICAL" in line:
            print(line)
    file = open("log_report.txt","w")

    file.write("Total Lines : " + str(len(lines)))
    file.write("Total Words : " + str(len(data.split())))
    file.write("Total Characters : " + str(len(data)))
    file.write("Total Vowels : " + str(vow))

    file.write("INFO : " + str(info))
    file.write("WARNING : " + str(warn))
    file.write("ERROR : " + str(err))
    file.write("CRITICAL : " + str(crit))

    file.write("ALERTS")

    for line in lines:
        if "ERROR" in line or "CRITICAL" in line:
            file.write(line+"\n")
    file.close()
    print("Report Created Successfully")
except FileNotFoundError:
    print("File Not Found")
finally:
    print("File Closed")