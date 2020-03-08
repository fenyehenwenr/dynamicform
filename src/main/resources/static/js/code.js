
function doPrint2(){
    if(getExplorer() == "IE"){
        pagesetup_null();
    }
    //根据div标签ID拿到div中的局部内容
    bdhtml=window.document.body.innerHTML;
    var jubuData = document.getElementById("printcontent").innerHTML;
    //把获取的 局部div内容赋给body标签, 相当于重置了 body里的内容
    window.document.body.innerHTML= jubuData;
    //调用打印功能
    window.print();
    window.document.body.innerHTML=bdhtml;//重新给页面内容赋值；
    return false;
}

function pagesetup_null(){
    var hkey_root,hkey_path,hkey_key;
    hkey_root="HKEY_CURRENT_USER";
    hkey_path="\\Software\\Microsoft\\Internet Explorer\\PageSetup\\";
    try{
        var RegWsh = new ActiveXObject("WScript.Shell");
        hkey_key="header";
        RegWsh.RegWrite(hkey_root+hkey_path+hkey_key,"");
        hkey_key="footer";
        RegWsh.RegWrite(hkey_root+hkey_path+hkey_key,"");
    }catch(e){}
}

function getExplorer() {
    var explorer = window.navigator.userAgent ;
    //ie
    if (explorer.indexOf("MSIE") >= 0) {
        return "IE";
    }
    //firefox
    else if (explorer.indexOf("Firefox") >= 0) {
        return "Firefox";
    }
    //Chrome
    else if(explorer.indexOf("Chrome") >= 0){
        return "Chrome";
    }
    //Opera
    else if(explorer.indexOf("Opera") >= 0){
        return "Opera";
    }
    //Safari
    else if(explorer.indexOf("Safari") >= 0){
        return "Safari";
    }
}