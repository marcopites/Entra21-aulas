// 1. Captura os elementos
const aceite = document.getElementById('aceite');
const btnEnviar = document.getElementById('btnEnviar');

// 2. Escuta a mudanca de estado do checkbox (marcar / desmarcar)
aceite.addEventListener('change', function () {
  // 3. Se estiver marcado, libera o botao; senao, bloqueia
  if (aceite.checked === true) {
    btnEnviar.disabled = false; // habilita
  } else {
    btnEnviar.disabled = true;  // desabilita
  }
});