$(document).ready(function () {
    $.get("http://localhost:8112/cloth",function (data,staus) {
        if (staus == "success"){
            showData(data);
        }
    })
})