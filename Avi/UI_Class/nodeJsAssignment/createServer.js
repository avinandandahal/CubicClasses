 var http = require('http');
 var grademod = require('./calculation');
 var url = require('url');
 //var score = document.getElementById("score").value;

 http.createServer(function(request,response) {
    
	
	var headerValue = request.headers;
	response.writeHead(200,{'content-Type' : 'text/html'});
	//var uri = url.parse(request.url,true);
	var uri = url.parse(request.url,true).query;
	
	var calculate = grademod.Calculate(uri.score);
	console.log(calculate);

	
    
    response.end(calculate);
 }).listen(3000);

         

//npm install express --save