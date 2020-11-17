var nameCustommer = document.getElementById("name");
var adressCustommer = document.getElementById("adress");
var tableCustommer = document.getElementById("tableProduct");
var listCustomer = [];

function addCustommer() {
    var add = new cussTommer();
    add.setName1(nameCustommer.value);
    add.setAdress(adressCustommer.value);
    nameCustommer.value = "";
    adressCustommer.value = "";
    listCustomer.push(add);
    show();

}

function show() {
    var drawTable = "<tr><th>Name</th>\n" +
        "<th>Adress</th>\n" +
        "</tr>";
    for (var i = 0; i < listCustomer.length; i++) {
        drawTable += "<tr>" +
            "<td>" + listCustomer[i].getName1() + "</td>" +
            "<td>" + listCustomer[i].getAdRess() + "</td>" +
            "<td><button onclick='deleteCustomer(" + i + ")'>Remove</button></td>" +
            "</tr>"
    }

    tableCustommer.innerHTML = drawTable;

}

var nameEmployee = document.getElementById("salary");
var worddayEmployee = document.getElementById("wordday");
var tableEmployee = document.getElementById("tableEmployee");
var listEmployee = [];

function addEmployee() {
    var add = new employee();
    add.setSalary(nameEmployee.value);
    add.setWordday(worddayEmployee.value);
    nameEmployee.value = "";
    worddayEmployee.value = "";
    listEmployee.push(add);
    showEmployee();
}

function showEmployee() {
    var drawTableE = "<tr><th>Salary</th>\n" +
        "<th>Wordday</th>\n" +
        "</tr>";
    for (var i = 0; i < listEmployee.length; i++) {
        drawTableE += "<tr>" +
            "<td>" + listEmployee[i].getSalary() + "</td>" +
            "<td>" + listEmployee[i].getWordday() + "</td>" +
            "<td><button onclick='deleteEmployee(" + i + ")'>Remove</button></td>" +
            "</tr>"
    }
    tableEmployee.innerHTML = drawTableE;
}

function deleteCustomer(i) {
    listCustomer.splice(i, 1);
    show();
}

function deleteEmployee(e) {
    listEmployee.splice(e, 1);
    showEmployee();
}

function hien() {
    var cus = document.getElementById("custommer");
    var em = document.getElementById("employee");
    var nut = document.getElementById("nut");

    if (nut.innerText === "Custommer") {
         cus.style.visibility = 'hidden';
        em.style.visibility = 'visible';
        nut.innerText = "Employee";
    }
     else {
        cus.style.visibility = 'visible';
        em.style.visibility = 'hidden';
        nut.innerText = "Custommer";
}


}

