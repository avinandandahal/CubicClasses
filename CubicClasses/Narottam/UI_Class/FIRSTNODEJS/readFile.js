var fs = require('fs');

fs.readFile("C:\\Users\\sony\\Documents\\Cubic Technologies\\FIRSTNODEJS\\testFile.txt", function(error, data) {

    console.log(data.toString());

});

console.log('Started reading file');