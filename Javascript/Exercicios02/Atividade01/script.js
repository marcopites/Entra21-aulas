// 1. Captura o formulário pelo id
const form = document.getElementById('meuForm');

// 2. Escuta o evento de submit
form.addEventListener('submit', function (evento) {
  // 3. Impede o comportamento padrão (recarregar a página)
  evento.preventDefault();

  // 4. Confirma que o envio foi interceptado pelo JS
  alert('Formulário interceptado com sucesso!');
});