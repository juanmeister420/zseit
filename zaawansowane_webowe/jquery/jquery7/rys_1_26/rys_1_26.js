$(function(){
  $('input').on('keyup', function(){
    const wartosc = $(this).val();
    $('p').eq(0).text(wartosc);
  }).keyup();
  function wyswietlpojednynczywybor() {
    const pojedynczywybor = $('#tylkojeden').val();
    $('p').eq(1).text('Twój wybór to: ' + pojedynczywybor);
  }

  $('select').change(wyswietlpojednynczywybor);
  wyswietlpojednynczywybor();

  function wyborJezyka() {
    const jakiJezyk = $('#tylkojeden').val();
    if (jakiJezyk == 'Stron Internetowych') {
      $('#log').text('');
      $('#ulubionyJezyk').html('Php <input type="radio" name="www" value="PHP"> Javascript <input type="radio" name="www" value="Javascript">');
      $('input').on('click', function () {
        $('#log').html('Wybrano: '+ $('input:checked').val());
      });
    }
    else if (jakiJezyk == 'Aplikacji Desktopowych') {
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

  function wyświetlWyborWielokrotny() {
    const wielokrotnyWybor = $('#wiele').val();
    $('p').eq(2).text('Twój wybór to: ' + wielokrotnyWybor.join(', '));
  }
  $('select').change(wyświetlWyborWielokrotny);
  wyświetlWyborWielokrotny();
}); 
  