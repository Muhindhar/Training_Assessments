class person:
    def __init__(self, name, age, email):
        self.name = name
        self.age = age
        self.email = email
    def display(self):
        print("Name :", self.name)
        print("Age :", self.age)
        print("Email :", self.email)

class trainee(person):
    def __init__(self, name, age, email, batchid, marks, project, public):
        super().__init__(name, age, email)
        self.batchid = batchid
        self.marks = marks
        self.project = project
        self.public = public
    def display(self):
        super().display()
        print("Batch ID :", self.batchid)
        print("Marks :", self.marks)
        print("Projects :", self.project)
        print("Publications :", self.public)

class SDETtrainee(trainee):
    def __init__(self, name, age, email, batchid, marks, project, public, tools):
        super().__init__(name, age, email, batchid, marks, project, public)
        self.tools = tools
    def comp_agg(self):
        avg = sum(self.marks) / len(self.marks)
        return (avg * 0.6) + (self.project * 5) + (self.public * 3)

trainees = []
for i in range(2): 
    print("Enter Trainee", i + 1)
    name = input("Enter the Name : ")
    age = int(input("Enter Age : "))
    email = input("Enter the Email : ")
    batch = input("Batch : ")
    marks = [int(input("Mark : ")) for i in range(5)]
    projects = int(input("Projects : "))
    publications = int(input("Publications : "))
    tool = input("Tool : ")
    obj = SDETtrainee(name, age, email, batch,marks, projects, publications, tool)
    trainees.append(obj)

highest = trainees[0]
for t in trainees:
    print("Details")
    t.display()
    print("Tool :", t.tools)
    print("Aggregate :",(t.comp_agg()))
    if t.comp_agg()>highest.comp_agg():
        highest = t
print("Highest aggregate trainee")
print("Name : ",highest.name)
print("Aggregate : ",(highest.comp_agg()))