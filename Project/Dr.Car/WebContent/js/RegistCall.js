

 $(document).ready(function(){
     $("button").click(function(){
    	 var sex = false
    	 if ($("#male").is(':checked'))
    	 {
    	      sex = true;
    	 }
    	 
    	 $.post("Registers",
         {
           email: $("#email").val(),
           loginName: $("#loginName").val(),
           password :$("#password").val(),
           name: $("#name").val(),
           phone: $("#phone").val(),
           streetName: $("#streetName").val(),
           streetNum: $("#streetNum").val(),
           cite: $("#cite").val(),
           postalcode: $("#postalcode").val(),
           male : sex,
           day : $("#day").val(),
           month : $("#month").val(),
           year : $("#year1").val(),
           nationality:$("#nationality").val(),

         },
         function(data,status){
             alert("Data ok ");
         });
     });
 });