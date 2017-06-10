var http = require('http');
var url = require('url');

http.createServer(function(req, res) {

var uri = url.parse(req.url).query;

console.log(uri);
res.writeHead(200, {'Content-Type':'text/html'});
res.write('Cubic Technologies');
res.end();

}).listen(8000);