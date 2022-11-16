$(function(){
  function wyświetlWyborWielokrotny() {
    const wielokrotnyWybor = $('#wiele').val();
    $('p').eq(0).text('Twój wybór to: ' + wielokrotnyWybor.join(', '));
  }
  $('select').change(wyświetlWyborWielokrotny);
  wyświetlWyborWielokrotny();
}); 
  