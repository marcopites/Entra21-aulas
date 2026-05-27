// 1. Captura o GRUPO de radios (todos com name="tipo") e o input documento
const radios = document.getElementsByName('tipo');
const documento = document.getElementById('documento');

// 2. Percorre cada radio do grupo e adiciona um listener de 'change'
radios.forEach(function (radio) {
  radio.addEventListener('change', function () {
    // 'this.value' = valor do radio que foi marcado agora

    if (this.value === 'juridica') {
      // Pessoa Juridica: bloqueia o campo, deixa cinza, troca o placeholder
      documento.disabled = true;
      documento.classList.add('fundo-cinza');
      documento.placeholder = 'CNPJ (nao implementado)';
      documento.value = ''; // limpa o que estava digitado
    } else {
      // Pessoa Fisica: libera o campo, tira o cinza, troca o placeholder
      documento.disabled = false;
      documento.classList.remove('fundo-cinza');
      documento.placeholder = 'CPF';
    }
  });
});