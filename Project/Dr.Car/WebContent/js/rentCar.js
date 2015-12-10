$(document).ready(function () {
            $(".buy").click(function(){
         $.post("RentCar",
         {
           carid: laptop.id,
           carname: laptop.name
         },
         function(data,status){
             alert("Data ok ");
         });
     });
        });