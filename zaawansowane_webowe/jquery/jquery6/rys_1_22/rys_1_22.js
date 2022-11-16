$(function(){
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
    else {
      $('#log').text('');
      $('#ulubionyJezyk').html(' ');
    }
  }
  $('select').change(wyborJezyka);
  wyborJezyka();
}); 
  