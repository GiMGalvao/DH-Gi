let novaTarefa = document.getElementById("novaTarea");
let botaoNovaTarefa = document.getElementById("botaoNovaTarefa")

botaoNovaTarefa.addEventListener('click', function(event){

    event.preventDefault();

    let criandoTarefas = {
         "description": novaTarefa.value,
         "completed": false
         
    };

    fetch('https://ctd-todo-api.herokuapp.com/v1/tasks', {

        method: 'POST',
        body: JSON.stringify(criandoTarefas),
        headers: “Authorization” :
        “eyJhbGciOiJIUzIǻNiIsInRǿcCIȀIkpXVCJȃ.eyJzdWIiOiIxMjMǺNTYǽODkwIi
        wibmFtZSIȀIkpvaGǾgRGȃlIiwiaWFǺIjoxNTEǼMjMǿMDIyfQ.SflKxwRJSMeK
        KFǼQTǾfwpMeJfǽȀPOkȀyJV_adQsswǿc”
        { 'content-type':'application/json'}


    })

    .then(function(response){
        return response.json()


    })

console.log(criandoTarefas);

})

