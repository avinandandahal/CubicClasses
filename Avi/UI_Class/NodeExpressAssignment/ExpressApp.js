var express = require('express');
var app = express();
var authmode = require('./AuthModule');
var url = require('url');
var bodyParser = require('body-parser');
var server = app.listen(3000);

app.use(bodyParser.urlencoded({extended:false}));

app.post('',function(request, response){
    // response.send("Username Password Match");
    var username = request.body.username;
    var password = request.body.password;

    console.log(username);
    console.log(password);

    var userAuthenticate = authmode.AuthUser(username, password);
    console.log(userAuthenticate);

    if( userAuthenticate == true){
        response.sendFile("E:\\Cubic\\UICLASS_Practice\\ExpressAndRestAPI\\CubicHome.html");
    }
    else
        response.sendFile("E:\\Cubic\\UICLASS_Practice\\ExpressAndRestAPI\\index-accessdenied.html");
});
