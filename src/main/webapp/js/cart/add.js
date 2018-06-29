
$(document).ready(function () {
    $(".add").on("click", function () {
        var id = $(this).find(".goods-id").val();
        console.log(id);
        $.ajax({
            url: "/cart/addCar/" + id,
            dataType: "json",
            type: "get",
            contentType: "application/json",
            async: true,
            data:{'search':id},
            success:function(data)
            {
                if(data.success == "true"){
                    alert("该商品已经成功加入购物车");

                }
            },
            error: function(){

                alert('error');
            }
        });
    });
});