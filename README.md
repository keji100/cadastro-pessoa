# Cadastro de PESSOA (API REST)
API Rest de um CRUD de cadastro de pessoa.

# Projeto desenvolvimento até o atual momento
- Estrutura de banco de dados quase toda normalizada.
- Utilização de banco de dados em mémoria.
- Classes utilitárias e  de padronização.
- Separação da camadas de négocios, acessso a dados, entidades e exposição de serviços.
- Utilização de padrões de projeto
  - Builder
  - Factory
  - DTO
- Metodo Inserção de pessoa fisica com a seguinte estrutura abaixo:
  - Recomendação de utilização : POSTMAN.
  - Seguir dados:
    - URL: "http://localhost:8080/pessoa"
    - Request: POST
	- Headers:
		- Content-Type: APPLICATION/JSON
    - Body: 
```
{
	"tipoPessoa": "FISICA",
	"numeroIdentificacao": "14135181090",
	"nomePrincipal": "Keji",
	"nomeSecudario": "Japa",
	"enderecos": [ 
		{
			"tipoEndereco": "Residencial",
			"tipo": "Avenida",
			"nome": "Batatinha",
			"numero": 123,
			"complemento": "",
			"cep": "921413",
			"bairro": "Fortnite village",
			"cidade": "Gokulandia",
			"estado": "RS",
			"pais": "Brasil"
		}
	],
	"telefones": [],
	"nomeProfissao": "Jogador de peteca",
	"salario": "10.00",
	"depedentes": [
		{
			"nome": "Neymar Junior",
			"tipoDependente": "FILHO"
		},
		{
			"nome": "Leila Cabeleleila",
			"tipoDependente": "FILHO"
		},
		{
			"nome": "Leidinaira",
			"tipoDependente": "MAE"
		}
	]
}

```

# Melhorias 
- Desenvolvimento das funcionalidades:
	- Finalização de cadastrado de pessoa fisica.
	- Criação de cadastro de pessoa juridica.
	- Exposição de serviços mais indepedente. (Passar json para atualizar apenas endereço)
- Criar sistema de autenticação por token.
- Configuração banco de dados com persitencia de dados.
- Adicionar validações com exceções personalizadas
- Testes unitários
- Melhorar documentação do código.
- Separação Classes utilitárias e  de padronização para transformação de um framework.
