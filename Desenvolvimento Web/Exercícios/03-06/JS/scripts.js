
function ex_01(){

    var elemento = document.getElementById("info");
    window.alert(elemento.innerText);

}

function ex_02(){

    var nodes = document.getElementsByName("estado_civil");

    for(var i = 0; i < nodes.length; i++){
        window.alert(nodes[i].value);
    }

}

function ex_03(){

    var nodes = document.getElementsByTagName("p");

    for(var i = 0; i < nodes.length; i++){
        window.alert(nodes[i].innerText);
    }
}

function ex_04(){

    var nodes = document.getElementsByClassName("normal");

    for(var i = 0; i < nodes.length; i++){
        window.alert(nodes[i].innerText);
    }
}

function ex_05(){

    var nodes = document.getElementsByName("estado_civil");    

    for(var i = 0; i < nodes.length; i++){
        if(nodes[i].checked){
            window.alert(nodes[i].value);
        }
    }

}

function ex_06(){
    var elemento_pai = document.body;
    var elemento = document.createElement("h1");
    var texto = document.createTextNode("Um texto...");
    elemento.appendChild(texto);

    elemento_pai.appendChild(elemento);
}

function ex_07(){

    var elemento = document.createElement("li");
    var texto = document.createTextNode(document.getElementById("tarefa").value);
    elemento.appendChild(texto);

    var list = document.getElementsByTagName("ul")[0];

    list.appendChild(elemento);

}