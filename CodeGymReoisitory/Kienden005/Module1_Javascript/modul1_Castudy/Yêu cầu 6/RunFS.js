var lishcustommer =[];
 var checkEdit = false;
var vadidatebrithday = /^((0)[1-9]|[1-2][0-9]|(3)[0-1])(\/)((0)[1-9]|(1)[0-2])(\/)\d{4}$/;
var validateemail =  /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
function displaymenu() {
    var number = prompt("Please! Do you want to choose type service?\n"
        + "1. Add New Customer.\n"
        + "2. Display Information Customer.\n"
        + "3. Edit Information Customer.\n"
        + "4. Delete Customer.\n"
        + "5. Exit.\n");
    switch (number) {
        case "1" :
            add();
            break;
        case "2" :
            displaycustommer();
            break;
        case "3" :
            EditCustommer();
            break ;
        case "4" :
            deleteCusstommer();
            break;
        default :
            main();
    }
}

 function add() {
     var addcusstommer = new CusTOmmer() ;
      addcusstommer.setName(prompt("Enter Name: "));
     addcusstommer.setIdcard(prompt("Enter Idcard: "));
     var cheickbrithday = false ;
     do{
         addcusstommer.setBrithday(prompt("Enter Brithday: "));
         if(vadidatebrithday.test(addcusstommer.getBrithday())){
             cheickbrithday = true;
         }
     }while (!cheickbrithday);
    var cheickmail = false;
    do {
        addcusstommer.setEmail(prompt("Enter Email: "));
        if (validateemail.test(addcusstommer.getEmail())){
            cheickmail = true;
        }
    }while (!cheickmail) ;

     addcusstommer.setAdress(prompt("Enter Adress: "));
     addcusstommer.setSale(prompt("Enter Sale: "));
     addcusstommer.setDaynumber(prompt("Enter daynumber: "));
     addcusstommer.setStyleroom(prompt("Enter StyleRoom: "));
     lishcustommer.push(addcusstommer);
     displaymenu();
 }
 function displaycustommer() {
      var choose = prompt("Chọn khách hàng muốn hiển thị: "+"\n"+
              listName() + (lishcustommer.length+1) + ": Back" );
    choose -- ;
     switch (choose) {
         case (lishcustommer.length):
             checkEdit = false;
             displaymenu();
             break;
         default:
             if (checkEdit) {
                 checkEdit = false;
                 prompt(infomation(choose));
             } else {
                 alert(infomation(choose));
             }
     }
    displaymenu();
 }
 function listName() {
     var result = "";
     for (var i = 0; i < lishcustommer.length; i++) {
         result += i + 1 + ". " + "Name: " + lishcustommer[i].getName() + " - " + "ID: " + lishcustommer[i].getIdcard() + "\n";
     }
     return result;
 }
function infomation(index) {
    return "1. Name:  " + lishcustommer[index].getName() + "\n"
        + "2. ID Card:  " + lishcustommer[index].getIdcard() + "\n"
        + "3. Birthday:  " + lishcustommer[index].getBrithday() + "\n"
        + "4. Email:  " + lishcustommer[index].getEmail() + "\n"
        + "5. Address:  " + lishcustommer[index].getAdress() + "\n"
        + "6. Sale:  " + lishcustommer[index].getSale() + "\n"
        + "7. Daynumber:  " + lishcustommer[index].getDaynumber() + "\n"
        + "8. StyleRoom:  " + lishcustommer[index].getStyleroom() + "\n"
        + "9. Bills:  " + lishcustommer[index].getBill() ;

}
function EditCustommer() {
    var choose = prompt("Chọn khách hàng muốn chỉnh sửa: "+"\n"+
        listName() + (lishcustommer.length+1) + ": Back" );
    choose -- ;
     switch (choose) {
         case (lishcustommer.length) :
             checkEdit = false ;
             displaymenu() ;
         default :
             var edit = prompt(infomation(choose));
             switch (edit) {
                 case "1" :
                    lishcustommer[choose].setName(prompt("Enter name: "));
                     alert(infomation(choose));
                     EditCustommer();
                 case "2" :
                     lishcustommer[choose].setIdcard()(prompt("Enter Identity Card customer :   "));
                     alert(infomation(choose).getIdcard());
                    infomation();
                 case "3":
                     lishcustommer[choose].setBrithday( prompt("Enter birthday customer :   ")) ;
                     alert(infomation(choose));
                     infomation();
                 case "4":
                     lishcustommer[choose].setEmail( prompt("Enter email customer :   "));
                     alert(infomation(choose));
                     infomation();
                 case "5":
                     lishcustommer[choose].setAdress(prompt("Enter address customer :   "));
                     alert(infomation(choose));
                    infomation();
                 case "6" :
                     lishcustommer[choose].setSale(prompt("Enter Sale customer :   "));
                     alert(infomation(choose));
                     infomation();
                 case "7" :
                     lishcustommer[choose].setDaynumber(prompt("EnterDay Numner :   "));
                     alert(infomation(choose));
                     infomation();
                 case "8" :
                     lishcustommer[choose].setStyleroom(prompt("Enter Style Room :   "));
                     alert(infomation(choose));
                     infomation();
                 default :
                    displaymenu();
             }
     }
     displaymenu();
}
function  deleteCusstommer() {
    var choose = prompt("Chọn khách hàng muốn xóa: "+"\n"+
        listName() + (lishcustommer.length+1) + ": Back" );
    choose -- ;
    lishcustommer.splice(choose,1);
    displaymenu() ;

};

function EditCustommer() {
    var choose = prompt("Chọn khách hàng muốn chỉnh sửa: "+"\n"+
        listName() + (lishcustommer.length+1) + ": Back" );
    choose -- ;
    switch (choose) {
        case (lishcustommer.length) :
            checkEdit = false ;
            displaymenu() ;
        default :
            var edit = prompt(infomation(choose));
            switch (edit) {
                case "1" :
                    lishcustommer[choose].setName(prompt("Enter name: "));
                    alert(infomation(choose));
                    EditCustommer();
                case "2" :
                    lishcustommer[choose].setIdcard()(prompt("Enter Identity Card customer :   "));
                    alert(infomation(choose).getIdcard());
                    infomation();
                case "3":
                    lishcustommer[choose].setBrithday( prompt("Enter birthday customer :   ")) ;
                    alert(infomation(choose));
                    infomation();
                case "4":
                    lishcustommer[choose].setEmail( prompt("Enter email customer :   "));
                    alert(infomation(choose));
                    infomation();
                case "5":
                    lishcustommer[choose].setAdress(prompt("Enter address customer :   "));
                    alert(infomation(choose));
                    infomation();
                case "6" :
                    lishcustommer[choose].setSale(prompt("Enter Sale customer :   "));
                    alert(infomation(choose));
                    infomation();
                case "7" :
                    lishcustommer[choose].setDaynumber(prompt("EnterDay Numner :   "));
                    alert(infomation(choose));
                    infomation();
                case "8" :
                    lishcustommer[choose].setStyleroom(prompt("Enter Style Room :   "));
                    alert(infomation(choose));
                    infomation();
                default :
                    displaymenu();
            }
    }
    displaymenu();
}
function  deleteCusstommer() {
    var choose = prompt("Chọn khách hàng muốn xóa: "+"\n"+
        listName() + (lishcustommer.length+1) + ": Back" );
    choose -- ;
    lishcustommer.splice(choose,1);
    displaymenu() ;

}

var lishcustommere =[];
var checkEdite = false;
var vadidatebrithdaye = /^((0)[1-9]|[1-2][0-9]|(3)[0-1])(\/)((0)[1-9]|(1)[0-2])(\/)\d{4}$/;
var validateemaile =  /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
function displaymenue() {
    var number = prompt("Please! Do you want to choose type service?\n"
        + "1. Add New Employee.\n"
        + "2. Display Information Employee.\n"
        + "3. Edit Information Employee.\n"
        + "4. Delete Employee.\n"
        + "5. Exit.\n");
    switch (number) {
        case "1" :
            adde();
            break;
        case "2" :
            displaycustommere();
            break;
        case "3" :
            EditEmloyee();
            break;
        case "4" :
            deleteCusstommere();
            break;
        default :
            main();

    }

    function adde() {
        var addcusstommere = new CusEmployee();
        addcusstommere.setNamee(prompt("Enter Name: "));
        addcusstommere.setIdcarde(prompt("Enter Idcard: "));
        var cheickbrithdaye = false;
        do {
            addcusstommere.setBrithdaye(prompt("Enter Brithday: "));
            if (vadidatebrithdaye.test(addcusstommere.getBrithdaye())) {
                cheickbrithdaye = true;
            }
        } while (!cheickbrithdaye);
        var cheickmaile = false;
        do {
            addcusstommere.setEmaile(prompt("Enter Email: "));
            if (validateemaile.test(addcusstommere.getEmaile())) {
                cheickmaile = true;
            }
        } while (!cheickmaile) ;

        addcusstommere.setAdresse(prompt("Enter Adress: "));
        addcusstommere.setSalee(prompt("Enter Sale: "));
        addcusstommere.setDaynumbere(prompt("Enter daynumber: "));
        addcusstommere.setStyleroome(prompt("Enter StyleRoom: "));
        lishcustommere.push(addcusstommer);
        displaymenue();
    }

    function displaycustommere() {
        var choose = prompt("Chọn nhân viên muốn hiển thị: " + "\n" +
            listNamee() + (lishcustommere.length + 1) + ": Back");
        choose--;
        switch (choose) {
            case (lishcustommere.length):
                checkEdite = false;
                displaymenue();
                break;
            default:
                if (checkEdite) {
                    checkEdite = false;
                    prompt(infomatione(choose));
                } else {
                    alert(infomatione(choose));
                }
        }
        displaymenue();
    }

    function listNamee() {
        var result = "";
        for (var i = 0; i < lishcustommer.length; i++) {
            result += i + 1 + ". " + "Name: " + lishcustommer[i].getNamee() + " - " + "ID: " + lishcustommer[i].getIdcarde() + "\n";
        }
        return result;
    }

    function infomatione(index) {
        return "1. Name:  " + lishcustommere[index].getNamee() + "\n"
            + "2. ID Card:  " + lishcustommere[index].getIdcarde() + "\n"
            + "3. Birthday:  " + lishcustommere[index].getBrithday() + "\n"
            + "4. Email:  " + lishcustommere[index].getEmaile() + "\n"
            + "5. Address:  " + lishcustommere[index].getAdresse() + "\n"
            + "6. Sale:  " + lishcustommere[index].getSalee() + "\n"
            + "7. Daynumber:  " + lishcustommere[index].getDaynumbere() + "\n"
            + "8. StyleRoom:  " + lishcustommere[index].getStyleroome() + "\n"
            + "9. Bills:  " + lishcustommere[index].getBille();

    }

    function EditEmloyee() {
        var choose = prompt("Chọn nhân viên muốn chỉnh sửa: " + "\n" +
            listNamee() + (lishcustommere.length + 1) + ": Back");
        choose--;
        switch (choose) {
            case (lishcustommere.length) :
                checkEdite = false;
                displaymenue();
            default :
                var edit = prompt(infomatione(choose));
                switch (edit) {
                    case "1" :
                        lishcustommer[choose].setNamee(prompt("Enter name: "));
                        alert(infomatione(choose));
                        EditEmloyee();
                    case "2" :
                        lishcustommere[choose].setIdcarde()(prompt("Enter Identity Card customer :   "));
                        alert(infomatione(choose).getIdcarde());
                        EditEmloyee();
                    case "3":
                        lishcustommere[choose].setBrithdae(prompt("Enter birthday customer :   "));
                        alert(infomatione(choose));
                        EditEmloyee();
                    case "4":
                        lishcustommere[choose].setEmaile(prompt("Enter email customer :   "));
                        alert(infomatione(choose));
                        infomation();
                    case "5":
                        lishcustommer[choose].setAdresse(prompt("Enter address customer :   "));
                        alert(infomatione(choose));
                        EditEmloyee();
                    case "6" :
                        lishcustommere[choose].setSalee(prompt("Enter Sale customer :   "));
                        alert(infomatione(choose));
                        EditEmloyee();
                    case "7" :
                        lishcustommere[choose].setDaynumbere(prompt("EnterDay Numner :   "));
                        alert(infomatione(choose));
                        EditEmloyee();
                    case "8" :
                        lishcustommere[choose].setStyleroome(prompt("Enter Style Room :   "));
                        alert(infomatione(choose));
                        EditEmloyee();
                    default :
                        displaymenue();
                }
        }
        displaymenue();
    }

    function deleteCusstommere() {
        var choose = prompt("Chọn khách hàng muốn xóa: " + "\n" +
            listNamee() + (lishcustommere.length + 1) + ": Back");
        choose--;
        lishcustommere.splice(choose, 1);
        displaymenue();
    }
}




