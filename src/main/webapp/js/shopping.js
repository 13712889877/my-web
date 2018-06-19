
$(document).ready(function () {
    $(".add-shopping").on("click", function () {
        var id = $(this).find(".goods-id").attr('value');
        console.log(id);
        $.ajax({
            url: "/addCar/" + id,
            dataType: "json",
            type: "get",
            contentType: "application/json",
            async: true,
            data:{'search':id},
            success:function(data)

            {

                alert('success');

            },
            error: function(){

                alert('error');

            }
        });
    });
});