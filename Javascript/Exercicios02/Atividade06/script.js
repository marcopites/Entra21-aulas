// 1. Captura os elementos
const senha = document.getElementById('senha');
const confirmarSenha = document.getElementById('confirmarSenha');
const msgSenha = document.getElementById('msgSenha');

// 2. Evento 'keyup': dispara a cada tecla SOLTA no campo de confirmacao.
//    Isso valida em tempo real, enquanto o usuario digita.
confirmarSenha.addEventListener('keyup', function () {
  // 3. Compara os dois valores
  if (confirmarSenha.value === senha.value) {
    // Iguais: borda verde, remove a vermelha
    confirmarSenha.classList.add('senha-ok');
    confirmarSenha.classList.remove('senha-erro');
    msgSenha.innerText = 'Senhas conferem.';
    msgSenha.style.color = 'green';
  } else {
    // Diferentes: borda vermelha, remove a verde
    confirmarSenha.classList.add('senha-erro');
    confirmarSenha.classList.remove('senha-ok');
    msgSenha.innerText = 'As senhas nao coincidem.';
    msgSenha.style.color = 'red';
  }
});