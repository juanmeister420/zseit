$(function(){
  function wyswietlpojednynczywybor() {
    const pojedynczywybor = $('#tylkojeden').val();
    $('p').eq(1).text('Twój wybór to: ' + pojedynczywybor);
  }

  $('select').change(wyswietlpojednynczywybor);
  wyswietlpojednynczywybor();

  function wyborJezyka() {
    const jakiJezyk = $('#tylkojeden').val();
    if (jakiJezyk == 'Aplikacji Desktopowych') {
      $('#log').text('');
      $('#ulubionyJezyk').html('C++ <input type="checkbox" name="desktop" value="C++"> Java <input type="checkbox" name="desktop" value="Java" ><button type="button">Sprawdź zaznaczenie</button>');
      $('button').on('click', function() {
        const favorite = [];
        $.each($('input[name="desktop"]:checked'), function () {
          favorite.push($(this).val());
      });

      const ilosc = function () {
        const n = $('input:checked').length;
        const x = (n === 1 ? 'Moim ulubionym językiem jest: ' : 'Moimi ulubionymi językami są:');
        alert(x + favorite.join(', '));
      };
      ilosc();
      });
    }
    else {
      $('#log').text('');
      $('#ulubionyJezyk').html('');
    }
  }
  $('select').change(wyborJezyka);
  wyborJezyka();
}); 
  