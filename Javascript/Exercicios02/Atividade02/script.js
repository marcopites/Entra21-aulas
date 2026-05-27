// 1. Captura os elementos que vamos usar
const form = document.getElementById('meuForm');
const nome = document.getElementById('nome');
const erroNome = document.getElementById('erroNome');

// 2. Escuta o envio do formulario
form.addEventListener('submit', function (evento) {
  // Impede o recarregamento padrao (conceito do Exercicio 01)
  evento.preventDefault();

  // 3. Validacao do campo obrigatorio
  if (nome.value === '') {
    // Campo vazio -> feedback de erro
    nome.classList.add('borda-vermelha');
    erroNome.innerText = 'Campo obrigatorio';
  } else {
    // Campo preenchido -> limpa o erro
    nome.classList.remove('borda-vermelha');
    erroNome.innerText = '';
  }
});