import re
class invalidfield(Exception):
    pass

def validmail(email):
    if re.fullmatch(r"[a-zA-Z0-9._]+@[a-zA-Z0-9._]+\.[a-zA-Z]{2,5}",email):
        print("Valid email")
    else:
        raise invalidfield("Invalid email")

def validphone(phone):
    if re.fullmatch(r"[6-9]\d{9}",phone):
        print("Valid phone number")
    else:
        raise invalidfield("Invalid phone number")

def validusername(name):
    if re.fullmatch(r"25MCA\d{3}", name):
        print("Valid usn")
    else:
        print("Invalid usn")