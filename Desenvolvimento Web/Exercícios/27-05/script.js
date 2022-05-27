function test(){
    var msg = "AAA";
    
    while (true) {
        msg += "!";
        document.getElementById("exit").innerHTML = msg;
    }
    
}