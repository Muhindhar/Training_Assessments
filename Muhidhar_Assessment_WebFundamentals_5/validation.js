document.getElementById("myForm").addEventListener("submit", function(e) {

    let valid = true;
    document.getElementById("nameError").innerText="";
    document.getElementById("emailError").innerText="";
    document.getElementById("dobError").innerText="";
    document.getElementById("courseError").innerText="";

    let name = document.getElementById("name").Value;
    if(name===""){
        document.getElementById("nameError").innerText="name required";
        valid = false;
    }

   let email = document.getElementById("email").value;
    if (!(email.includes("@"))) {
        document.getElementById("emailError").innerText = "Enter valid email";
        valid = false;
    }

    let course = document.getElementById("course").value;
    if(course===""){
        document.getElementById("courseError").innerText = "enter valid course";
        valid = false;
    }
});
