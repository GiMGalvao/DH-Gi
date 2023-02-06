// let aluno = {
//         nome: "Giovanna",
//         faltas: 3,
//         notas: [8,6,9]

// }

// function Aluno (alunoNome, alunoFaltas, alunoNotas){

//     this.nome = alunoNome,
//     this.faltas = alunoFaltas,
//     this.notas = alunoNotas;

// }

// console.log(aluno)

let aluno2 = {
    notas: [8, 6, 9],
    media: function(notas){
        return this.notas([0]) + this.notas([1]) + this.notas([2])/2;
    },
    faltas: function(){
        return this.faltas ++; 

    }


}

console.log(aluno2.notas)

