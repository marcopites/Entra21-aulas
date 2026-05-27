// 1. Captura todos os elementos que vamos usar
const form = document.getElementById('meuForm');

const nome = document.getElementById('nome');
const email = document.getElementById('email');
const senha = document.getElementById('senha');

const erroNome = document.getElementById('erroNome');
const erroEmail = document.getElementById('erroEmail');
const erroSenha = document.getElementById('erroSenha');

// 2. Escuta o envio do formulario
form.addEventListener('submit', function (evento) {
  // Impede o envio padrao (sempre, para validarmos primeiro)
  evento.preventDefault();

  // 3. RESET: limpa todos os erros antes de validar de novo
  limparErros();

  // Flag que controla se o formulario inteiro esta valido.
  // Comeca como true e vira false assim que qualquer campo falhar.
  let formularioValido = true;

  // 4. Validacao do NOME (nao pode estar vazio)
  if (nome.value.trim() === '') {
    nome.classList.add('input-invalido');
    erroNome.innerText = 'O nome e obrigatorio.';
    formularioValido = false;
  }

  // 5. Validacao do EMAIL (precisa conter @ e .)
  if (!email.value.includes('@') || !email.value.includes('.')) {
    email.classList.add('input-invalido');
    erroEmail.innerText = 'E-mail invalido.';
    formularioValido = false;
  }

  // 6. Validacao da SENHA (minimo 6 caracteres)
  if (senha.value.length < 6) {
    senha.classList.add('input-invalido');
    erroSenha.innerText = 'A senha deve ter no minimo 6 caracteres.';
    formularioValido = false;
  }

  // 7. DECISAO FINAL
  if (formularioValido) {
    // Sucesso: avisa, limpa os campos e remove os erros visuais
    alert('Cadastro realizado!');
    form.reset();
    limparErros();
  }
  // Se nao estiver valido, nao faz nada:
  // os erros ja foram exibidos acima e o envio ja foi impedido.
});

// Funcao auxiliar: remove bordas vermelhas e mensagens de todos os campos
function limparErros() {
  nome.classList.remove('input-invalido');
  email.classList.remove('input-invalido');
  senha.classList.remove('input-invalido');

  erroNome.innerText = '';
  erroEmail.innerText = '';
  erroSenha.innerText = '';
}