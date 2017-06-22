// <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
//    <script type="text/javascript">
    $(document).ready(function(){


            $("#submit").click(function(){

                 var na=$('#name').val();
                 var p=$('#password').val();
                 var m=$('#mail').val();
                 var dit={'err_name':error,"uname":na,"pas":p,"mail":m};
                 console.log("the error value is "+error);
            $.ajax({
                    type: "POST",
                    url: "signup",
                    data:dit,
                    dataType:"json",
                    success:function(data){
//                    var d=JSON.parse(data);
//                    var va=d.val;

                    $("#demo").html("the value is");
                    }
                    });





//                        $.post( "signup",
//                           { "err_name": error,"uname":na },
//
//
//                           function (data)
//                            {
//                            $("#demo").html(data);
//                            }
//                         );
                            //console.log(data);
//                            if(error="false")
//                            {

//                            }
//                            if(error="true")
//                                {
//
//                                window.location='login';
//                                }
//                            if(data=='error')
//                            {
//
//                            }
//                            else{
//                            window.location=data;
//
//                            }
                            //}
//                          "html"
                            //);

//        if(error=="true"){
//        $.get("signup")
//        }else{
//
//        }
//var dat=$("#name").val();
//        var pas=$("#password").val();
        //console.log(data);

// $.post( "welcome", {data: dat});
//$.ajax({
//  type: "POST",
//  url: "welcome",
//  data: {'data':dat},
//});

//     ,function(data){
//
//    var w = window.open('about:blank', 'windowname');
//    w.document.write(data);
//    w.document.close();
//     })
//  .done(function( data ) {
//    alert( "Data Loaded: " + data );
//  });

        });



      function name()
      {
        $("#name").keyup(function()
        {
        	var value=$("#name").val();
        	var re=/[a-zA-Z]{3,20}/;
        	if(re.test(value))
        	{
                 $("#nameerror").html("valid username");
                 error="false";
        	}else
        	 {
               $("#nameerror").html("invalid username");

             }
        });
      }

      function pwd()
      {
        $("#password").keyup(function()
        {
        	var value=$("#password").val();
        	var re=/[a-zA-Z0-9]{8,20}/;
        	if(re.test(value))
        	{
                 $("#pwderror").html("valid password");
                 error="false";
        	}else
        	 {
               $("#pwderror").html("invalid-atleast 8 characters");

             }
        });
      }
      function confirm()
      {
        $("#confirm").keyup(function()
        {
        	var first=$("#password").val();
        	var second=$("#confirm").val();
            if(first==second)
        	{
                 $("#confirmerror").html("password matches");
                  error="false";
        	}else
        	 {
               $("#confirmerror").html("Retry");
             }
        });
      }
      function mail()
      {
        $("#mail").keyup(function()
        {
        	var value=$("#mail").val();
        	var re=/[a-zA-Z0-9]+@+[a-zA-Z]+.+[a-zA-Z]/;
        	if(re.test(value))
        	{
                 $("#mailerror").html("valid email");
                 error="false";
        	}else
        	 {
               $("#mailerror").html("invalid email");

             }
        });
      }


        name()
        pwd()
        confirm()
        mail()
        var error="true";
   });


//    </script>