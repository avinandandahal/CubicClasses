var users = [{userName:'adahal', password:'adahal'},
                {userName:'avi', password:'avi'}
            ];

exports.AuthUser = function (username, password){

    for(var i=0; i<users.length;i++){
           //console.log(users[i].userName);
           //console.log(users[i].password);
            if(username===users[i].userName && password===users[i].password){
                return true;
            } 
                  
    }    
}


