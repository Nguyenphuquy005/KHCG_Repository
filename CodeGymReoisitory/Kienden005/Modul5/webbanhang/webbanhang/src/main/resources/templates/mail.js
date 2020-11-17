var billContainer = document.getElementById("bill-info");
var btn = document.getElementById("btn");
// btn.addEventListener("click",function () {
    var ourRequest = new XMLHttpRequest();
    ourRequest.open('GET','http://localhost:8080/goods-view');
    ourRequest.onload =function () {
        var  ourData = JSON.parse(ourRequest.responseText);
        renderHtml(ourData);
    };
    ourRequest.send();
// })

function getInfor() {
    var search = document.getElementById("search").value;
    if (search == "") {
        var valid = "Hãy nhập vào tên sản phẩm hoặc danh mục cần tìm kiếm!";
        document.getElementById("valid").innerHTML = valid;
    } else {
        document.getElementById("valid").innerHTML = "";
    }
}
function backInfor() {
    window.location = '/';
}
function renderHtml(data) {
var htmlString = "";
    for (let i = 0; i < data.length; i++) {
        htmlString += "<div  style='height: 200px;width: 250px;background-color: azure'>"
            +`<a href=""><img style="width: 100px;height: 100px" src="${data[i].srcImg}"></a>`+"<br>"
            + "<span style='color: red'>"+ "Price: " + data[i].price + "</span>" +"<br>"
            + "<span style='color: red'>"+ "GoodsName: " + data[i].goodName + "</span>" +"<br>"
            + "<span style='color: red'>"+ "Category :" + data[i].category.name + "</span>"
        +"</div>"+"<br>"+"<br>"
    }
    billContainer.insertAdjacentHTML("beforeend",htmlString);
}

var keywordValue= "da xanh";
var request = $.ajax({
    url: "http://localhost:8080/goods-view",
    type: "GET",
    data: {keyword: keywordValue},
    contentType: 'application/json; charset=utf-8',
    success: function (data) {
    alert(data);
    },
    error: function () {
    alert("error");
    }
});


