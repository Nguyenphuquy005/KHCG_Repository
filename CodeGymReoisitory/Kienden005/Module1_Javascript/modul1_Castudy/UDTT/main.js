main();
function main() {
    var cuorem = prompt("1.Cusstommer" + "/n" + "2.Employee")
    switch (cuorem) {
        case "1" :
            displaymenu();
            break;
        case "2" :
            displaymenue() ;
            break;
        default :
            main();
    }
}