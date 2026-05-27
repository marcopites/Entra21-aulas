// 1. Captura os elementos que vamos usar
const form = document.getElementById('meuForm');
const email = document.getElementById('email');
const erroEmail = document.getElementById('erroEmail');

// 2. Escuta o envio do formulario
form.addEventListener('submit', function (evento) {
  evento.preventDefault();

  // 3. Pega o valor digitado
  const valor = email.value;

  // 4. Regra simples do exercicio: precisa conter @ E .
  const ehValido = valor.includes('@') && valor.includes('.');

  if (ehValido) {
    // E-mail valido -> borda verde, remove a vermelha, limpa erro
    email.classList.add('input-valido');
    email.classList.remove('input-invalido');
    erroEmail.innerText = '';
  } else {
    // E-mail invalido -> borda vermelha, remove a verde, mostra mensagem
    email.classList.add('input-invalido');
    email.classList.remove('input-valido');
    erroEmail.innerText = 'E-mail invalido';
  }
});