
$("#user_form").submit(function(){
    parent.layer.close(index); //再执行关闭
    $.ajax({
        async: false,
        type: "POST",
        url: "/login/sinup1",
        contentType : "application/json",
        data:$("#user_form").serialize(),
        dataType: "text",
        success: function () {
        },
        error: function () {
        }
    })
})