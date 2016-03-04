/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {


/////OPGAVE 1
//    $("#button").click(function () {
//        $("#placeholder").load("UIServlet");
//    });
////Opgave 3    
//
//
//    $("#submit").click(function () {
//        var fields = $("#test").serializeArray();
//
//        var url = $("#test").attr("action");
//        
//        
//        
//        $.post(url, fields);
//
//    });
//opgave 4

$("#placeholder").text(setInterval(function(){
   $("#placeholder").load("UIServlet"); 
}), 1000);

});
