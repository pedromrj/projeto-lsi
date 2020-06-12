# Projeto LSI

** End-Points **
-------------
** Professor: ** 
* Listar todos: GET - localhost:8080/api/professor

	> "EXEMPLO RETURN BODY: 
	{[
    	{
        	"id": 1,
        	"nome": "Nome Professor"
    	}
	]}"

* Criar um professor: POST - localhost:8080/api/professor

	> "EXEMPLO BODY: {"nome":"Nome do Professor"}"
	
* Buscar professor por id: GET - localhost:8080/api/professor/{id}

	> "EXEMPLO RETURN BODY:
	 {
	 	"id":id do Professor,
	 	"nome": "nome do professor" 
	 }"
	 
* Atualizar um professor: PUT - localhost:8080/api/professor/{id}

	> "EXEMPLO BODY:
	{	"id": id do professor que deseja alterar,
		"nome": "Novo nome do professor"
	}"
	
* Deletar um professor: DELETE - localhost:8080/api/professor/{id}

	> ""

** Curso: ** 
* Listar todos: GET - localhost:8080/api/curso

	> "EXEMPLO RETURN BODY: 
	{[
    	{
        	"id": id do curso,
        	"codigo": codigo do curso
        	"nome": "Nome do curso"
    	}
	]}"

* Criar um curso: POST - localhost:8080/api/curso

	> "EXEMPLO BODY: 
	{
		"codigo": codigo do curso,
		"nome":"Nome do curso"
	}"
	
* Buscar curso por id: GET - localhost:8080/api/curso/{id}

	> "EXEMPLO RETURN BODY:
	 {
	 	"id":id do curso,
	 	"codigo": codigo do curso
	 	"nome": "nome do curso" 
	 }"
	 
* Atualizar um curso: PUT - localhost:8080/api/curso/{id}

	> "EXEMPLO BODY:
	{	"id": id do curso que deseja alterar,
		"codigo": novo codigo do curso,
		"nome": "Novo nome do curso"
	}"
	
* Deletar um curso: DELETE - localhost:8080/api/curso/{id}

	> ""

** Aluno: ** 
* Listar todos: GET - localhost:8080/api/aluno

	> "EXEMPLO RETURN BODY: 
	{[
    	{
        	"id": id do aluno,
        	"nome": "Nome aluno",
        	"cpf":"cpf do aluno",
        	"idcurso":id do curso do aluno
    	}
	]}"

* Criar um aluno: POST - localhost:8080/api/aluno

	> "EXEMPLO BODY: 
	{
		"nome": "Nome aluno",
       "cpf":"cpf do aluno",
       "idcurso":id do curso do aluno
	}"
	
* Buscar aluno por id: GET - localhost:8080/api/aluno/{id}

	> "EXEMPLO RETURN BODY:
	 {
	 	"id": id do aluno,
       "nome": "Nome aluno",
       "cpf":"cpf do aluno",
       "idcurso":id do curso do aluno
	 }"
	 
* Atualizar um aluno: PUT - localhost:8080/api/aluno/{id}

	> "EXEMPLO BODY:
	{	
		"id": id do aluno,
      "nome": "Nome aluno",
      "cpf":"cpf do aluno",
      "idcurso":id do curso do aluno
	}"
	
* Deletar um aluno: DELETE - localhost:8080/api/aluno/{id}

	> ""

** Disciplina: ** 
* Listar todos: GET - localhost:8080/api/disciplina

	> "EXEMPLO RETURN BODY: 
	{[
    	{
        	"id": id da disciplina,
        	"nome":"Nome da disciplina",
			"codCurso":codigo do curso,
			"codProf":codigo do professor que ministra
    	}
	]}"

* Criar uma desciplina: POST - localhost:8080/api/disciplina

	> "EXEMPLO BODY: 
	{
		"nome":"Nome da disciplina",
		"codCurso":codigo do curso,
		"codProf":codigo do professor que ministra
	}"
	
* Buscar disciplina por id: GET - localhost:8080/api/disciplina/{id}

	> "EXEMPLO RETURN BODY:
	 {
	 	"id": id da disciplina,
      	"nome":"Nome da disciplina",
		"codCurso":codigo do curso,
		"codProf":codigo do professor que ministra
	 }"
	 
* Atualizar um disciplina: PUT - localhost:8080/api/disciplina/{id}

	> "EXEMPLO BODY:
	{	
		"id": id da disciplina,
      	"nome":"Nome da disciplina",
		"codCurso":codigo do curso,
		"codProf":codigo do professor que ministra
	}"
	
* Deletar uma disciplina: DELETE - localhost:8080/api/disciplina/{id}

	> ""

** Matricula: ** 

* Criar uma Matricula: POST - localhost:8080/api/matricula

	> "EXEMPLO BODY: 
	{
		"alunoId":id do aluno,
		"cursoId":id do curso,
		"disciplinaIds":[lista de id de disciplina, separado por virgula]
	}"
	
