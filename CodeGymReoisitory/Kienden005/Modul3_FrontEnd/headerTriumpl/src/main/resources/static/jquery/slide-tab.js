$(function () {
    var isblook = false ;
    $('#bikestyle').click(function () {
        isblook = !isblook ;
        if (isblook){
            $('#bikeblook').css({"display":"block"})
            $('#bikeblook').timeout(100000) ;

        }
        else {
            $('#bikeblook').css({"display":"none"})

        }
    })
})
$( function() {
    $('#tabs1').click(function () {
        $('#tabs-1').css({"display": "block"})
        $('#tabs-2').css({"display": "none"})
        $('#tabs-3').css({"display": "none"})
    })
    $('#tabs2').click(function () {

        $('#tabs-2').css({"display": "block"})
        $('#tabs-1').css({"display": "none"})
        $('#tabs-3').css({"display": "none"})
    })
    $('#tabs3').click(function () {

        $('#tabs-3').css({"display": "block"})
        $('#tabs-2').css({"display": "none"})
        $('#tabs-1').css({"display": "none"})
    })
} );
