var cussTommer = function() {
    this.setName1 = function (name) {
        this.name =name;
    };
    this.getName1 = function () {
        return this.name
    };
    this.setAdress = function (adresss) {
        this.address =  adresss ;
    };
    this.getAdRess = function () {
        return this.address ;
    };
}

function employee() {
    this.setSalary = function (salary) {
        this.salary = salary;
    };
    this.getSalary = function () {
        return this.salary
    };
    this.setWordday = function (wordday) {
        this.wordday = wordday ;
    };
    this.getWordday = function () {
      return    this.wordday;
    }
}