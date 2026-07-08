student={}
nostud = int(input("Enter the number of students : "))
for i in range(nostud):
    num = input("enter the number : ")
    mark = int(input("Enter the marks : "))
    student[num] =mark

maxmark = max(student.values())
minmark = min(student.values())
for num, mark in student.items():
    if mark == maxmark:
        print("Maximum Marks :", maxmark, "-",num)
for usn, mark in student.items():
    if mark == minmark:
        print("Minimum Marks :", minmark, "-",num)

distin = []
merit=[]
passmark=[]
fail=[]

for num,mark in student.items():
    if(mark>=86 and mark<=100):
        distin.append(num)
    elif(mark>=76 and mark<=85):
        merit.append(num)
    elif(mark>=60 and mark<=75):
        passmark.append(num)
    elif(mark<60):
        fail.append(num)
print("Distinction : ",distin)
print("Merit : ",merit)
print("Pass : ",passmark)
print("Fail : ",fail)

tot =0
for mark in student.values():
    tot= tot + mark
avg = tot/len(student)
print("Average marks: ",avg)

print("Below Average Students")
for num, mark in student.items():
    if mark<avg:
        print(num)
        
marks = list(student.values())
marks.sort(reverse=True)
print("Leaderboard")
for mark in marks:
    for usn in student:
        if student[usn] == mark:
            print(usn, ":", mark)   