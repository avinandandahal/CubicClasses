
var http = require('http');
var url = require('url');

var grademod = require('./GradeModule');


    http.createServer(function(req, res) {
        res.writeHead(200, {'Content-Type': 'text/html'});
        
        
        var uri = url.parse(req.url, true).query;
        score = uri.score;

        setTimeout(function() {
            console.log("Score: " + score);
        }, 2000);

        setTimeout(function() {
            console.log("Calculating Grade.....");
         }, 3000);

        var grade = grademod.Grade(score);
        setTimeout(function() {
            console.log("Grade: " + grade + "\n");
            res.write("Grade: " + grade);
        }, 6000);
    }).listen(8000);



