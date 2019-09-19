function clientCheckBlank(bcOrsb) {
    var strMessage = "";

    var bDateTimeVal = $("#txt_bDateTime").val();
    var eDateTimeVal = $("#txt_eDateTime").val();

    var timeVal = $("#hidTimeVal").val(); 

    //alert(eDateTimeVal);

    var DATE_FORMAT = /^[0-9]{4}-[0-1]?[0-9]{1}-[0-3]?[0-9]{1}$/;
    if (!DATE_FORMAT.test(bDateTimeVal)) {
        strMessage += "开始时间日期格式输入有误" + "\n";
    }
    if (!DATE_FORMAT.test(eDateTimeVal)) {
        strMessage += "结束时间日期格式输入有误" + "\n";
    }

    var arr1 = bDateTimeVal.split("-");


    var date1 = new Date(bDateTimeVal.replace("-", "/").replace("-", "/")); //begintime_ms;//new Date();  //开始时间

    var date2 = new Date(eDateTimeVal.replace("-", "/").replace("-", "/")); //endtime_ms;//new Date();    //结束时间

    if (date1 > date2) {
        strMessage += "查询结束时间必须大于开始时间" + "\n";
     }

    var date3 = date2.getTime() - date1.getTime();

    //计算出相差天数
    var days = Math.floor(date3 / (24 * 3600 * 1000));
    if (days > timeVal) {
        strMessage += "时间范围只能查询" + timeVal + "天之内的数据" + "\n";
    }

    if (strMessage != "") {
        alert(strMessage);
        return false;
    }
    else {
        //doCheck();
        return true;
    }
}


function checkDate(dateVal) {

    var timeVal = $("#hidTimeVal").val();
     
    var bDateTimeVal = $("#txt_bDateTime").val();
    var curDate = new Date(bDateTimeVal.replace("-", "/").replace("-", "/"));

    var newDate = new Date(curDate.setDate(curDate.getDate() + timeVal));
    
    
    //var bDateTimeVal= newDate.Format("yyyy-MM-dd");//new Date().Format("yyyy-MM-dd hh:mm:ss"));

    //alert(bDateTimeVal);

    //alert(getMyDate(newDate));

    var bDateTimeVal = getMyDate(newDate);
    
    $("#txt_eDateTime").val(bDateTimeVal);
}


function checkEndDate(dateVal) {

    var timeVal = $("#hidTimeVal").val();
    
    var bDateTimeVal = $("#txt_eDateTime").val();
    var curDate = new Date(bDateTimeVal.replace("-", "/").replace("-", "/"));

    var newDate = new Date(curDate.setDate(curDate.getDate() - timeVal));


    //var bDateTimeVal= newDate.Format("yyyy-MM-dd");//new Date().Format("yyyy-MM-dd hh:mm:ss"));

    //alert(bDateTimeVal);

    //alert(getMyDate(newDate));

    var bDateTimeVal = getMyDate(newDate);

    //$("#txt_bDateTime").val(bDateTimeVal);
}


function getMyDate(tmpDate) {
    var date1, date2;
    //定义两个变量
    date1 = tmpDate.getMonth() + 1 + "";
    //获取当前月份+1的值
    if (date1.length < 2)
    //判断当前月份是否是双位数，10以上
        date1 = "0" + date1;
    //单位数的情况下，需要在月份前补0
    date2 = tmpDate.getDate() + "";
    //获取当前日期 
    if (date2.length < 2)
    //判断日期的位数是否是双位
        date2 = "0" + date2;
    //不足双位补0
    return tmpDate.getYear() + "-" + date1 + "-" + date2;
    //返回完整的日期
}
