var CusTOmmer =   function () {
    this.setName = function (name) {
        this.name = name;
    };
    this.getName= function () {
        return this.name;
    };
    this.setIdcard = function (idcard) {
        this.idcard = idcard;
    };
    this.getIdcard = function () {
        return this.idcard;
    };
    this.setBrithday = function (brithday) {
        this.brithday = brithday;
    };
    this.getBrithday = function () {
        return this.brithday;
    };
    this.setEmail= function (email) {
        this.email = email;
    };
    this.getEmail = function () {
        return this.email;
    };
    this.setAdress = function (adress) {
        this.adress = adress;
    };
    this.getAdress = function () {
        return this.adress;
    };
    this.setSale = function (sale) {
        this.sale = sale;
    };
    this.getSale = function () {
        return this.sale;
    };
    this.setDaynumber = function (daynumber) {
        this.daynumber = daynumber;
    };
    this.getDaynumber = function () {
        return this.daynumber;
    };
    this.setStyleroom = function (styleroom) {
        this.styleroom = styleroom;
    };
    this.getStyleroom = function () {
        return this.styleroom;
    };

    this.getBill = function () {
        var price = 0;
        if (this.getStyleroom() === "Villa") {
            price = 500;
        } else if (this.getStyleroom() === "House") {
            price = 300;
        } else if (this.getStyleroom() === "Room") {
            price = 100;
        }
        return price * parseFloat(this.getDaynumber()) * (1 - parseFloat(this.getSale()) / 100);
    }
};
var CusEmployee =   function () {
    this.setNamee = function (namee) {
        this.namee = namee;
    };
    this.getNamee= function () {
        return this.namee;
    };
    this.setIdcarde = function (idcarde) {
        this.idcarde = idcarde;
    };
    this.getIdcarde = function () {
        return this.idcarde;
    };
    this.setBrithdae = function (brithdaye) {
        this.brithdaye = brithdaye;
    };
    this.getBrithdaye = function () {
        return this.brithdaye;
    };
    this.setEmaile = function (emaile) {
        this.emaile = emaile;
    };
    this.getEmaile = function () {
        return this.emaile;
    };
    this.setAdresse = function (adresse) {
        this.adresse = adresse;
    };
    this.getAdresse = function () {
        return this.adresse;
    };
    this.setSalee = function (salee) {
        this.salee= salee;
    };
    this.getSalee = function () {
        return this.salee;
    };
    this.setDaynumbere = function (daynumbere) {
        this.daynumbere = daynumbere;
    };
    this.getDaynumbere = function () {
        return this.daynumbere;
    };
    this.setStyleroome = function (styleroom) {
        this.styleroome = styleroome;
    };
    this.getStyleroome = function () {
        return this.styleroome;
    };

    this.getBille = function () {
        var pricee = 0;
        if (this.getStyleroome() === "Villa") {
            price = 500;
        } else if (this.getStyleroome() === "House") {
            price = 300;
        } else if (this.getStyleroome() === "Room") {
            price = 100;
        }
        return price * parseFloat(this.getDaynumbere()) * (1 - parseFloat(this.getSalee()) / 100);
    }
};