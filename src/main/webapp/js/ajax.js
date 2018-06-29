window.onload = function () {
    //后台验证
    bgProcess();
    //提交注册信息，返回注册成功与否
    $('btn').onclick = function () {
        var jsonData = {
            username: $('username').value, passw: $('passw').value,
            repassw: $('repassw').value, email: $('email').value
        };
        ajax('regProccess.php', jsonData, getInfo, 'json');
    };
    function getInfo(info) {
        var a = ['username', 'passw', 'repassw', 'email'];
        var b = ['user', 'pass', 'rep', 'em'];
        var flag = true;
        for (var i = 0; i < info.length; i++) {
            if (info[i].state == 'false') {
                flag = false;
                displayInfo(info[i], b[i], a[i]); //显示错误信息
            }
        }
        if (flag) alert('恭喜你注册成功');
    }
};
//后台验证
function bgProcess() {
    //验证用户名
    $('username').onblur = function () {
        var jsonData = {username: this.value};
        ajax('regProccess.php', jsonData, getUser, 'json');
    };
    function getUser(msg) {
        displayInfo(msg[0], 'user', 'username');
    }

    //验证密码
    $('passw').onkeyup = $('passw').onblur = function () {
        var jsonData = {passw: this.value};
        ajax('regProccess.php', jsonData, getPass, 'json');
    };
    function getPass(msg) {
        displayInfo(msg[1], 'pass', 'passw');
    }

    //确认密码
    $('repassw').onblur = function () {
        var jsonData = {passw: $('passw').value, repassw: this.value};
        ajax('regProccess.php', jsonData, getRepass, 'json');
    };
    function getRepass(msg) {
        displayInfo(msg[2], 'rep', 'repassw');
    }

    //验证邮箱
    $('email').onblur = function () {
        var jsonData = {email: this.value};
        ajax('regProccess.php', jsonData, getEmail, 'json');
    };
    function getEmail(msg) {
        displayInfo(msg[3], 'em', 'email');
    }
}
//显示信息
function displayInfo(msg, id, name) {
    $(id).className = (msg.state == 'true') ? 'ok' : 'error';
    $(id).innerHTML = msg[name];
}
function $(id) {
    return document.getElementById(id);
}
